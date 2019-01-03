package com.heima.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.*;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebFilter("/*")
public class WordFilter implements Filter {
    public void destroy () {
    }

    public void doFilter (ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        //设置request字符编码
        req.setCharacterEncoding("utf-8");
        //设置response字符编码
        resp.setContentType("text/html;charset=utf-8");
        // Proxy
        ServletRequest newReq = (ServletRequest) Proxy.newProxyInstance (req.getClass ().getClassLoader (), req.getClass ().getInterfaces (), new InvocationHandler () {
            @Override
            public Object invoke (Object proxy, Method method, Object[] args) throws Throwable {
                //判断方法名是否是 getParameter
                if(method.getName ().equals ("getParameter")) {
                    String value = (String) method.invoke (req, args);
                    if(value != null){
                        for (String str : list) {
                            if(value.contains (str)){
                                value = value.replaceAll(str,"***");
                            }
                        }
                    }
                    return value;
                }
                //判断方法名是否是 getParameterMap
                if(method.getName ().equals ("getParameterMap")) {
                    Map<String, String[]> parameterMap = (Map<String, String[]>) method.invoke (req, args);
                    Map<String, String[]> map = new HashMap<> (parameterMap);
                    String[] strs;
                    String value;
                    for (String key : map.keySet ()) {
                        strs = map.get (key);
                        for (int i = 0; i < strs.length; i++) {
                            value = strs[i];
                            if(value != null){
                                for (String str : list) {
                                    if(value.contains (str)){
                                        strs[i] =  value.replaceAll(str,"***");
                                        map.replace (key,strs);
                                    }
                                }
                            }
                        }
                    }
                    return map;
                }

                //判断方法名是否是 getParameterValues

                return method.invoke(req,args);

            }
        });
        chain.doFilter (newReq, resp);
    }

    // 存入list
    List<String> list = new ArrayList<> ();
    public void init (FilterConfig config) throws ServletException {
        // 获取 servletContext对象
        ServletContext servletContext = config.getServletContext ();
        // 获取真实路径
        String realPath = servletContext.getRealPath ("/WEB-INF/classes/word.properties");
//        InputStream is = WebFilter.class.getClassLoader ().getResourceAsStream ("word.properties");
//        System.out.println (is);
        // 加载文件
        try {
//            BufferedReader br = new BufferedReader (new InputStreamReader ());
//            BufferedReader br = new BufferedReader(new InputStreamReader (is,"utf-8"));
            BufferedReader br = new BufferedReader(new InputStreamReader (new FileInputStream (realPath),"utf-8"));
            String line;

            while ((line = br.readLine ()) != null){
                list.add (line);
            }
            br.close ();
        } catch (Exception e) {
            e.printStackTrace ();
        }

    }

}
