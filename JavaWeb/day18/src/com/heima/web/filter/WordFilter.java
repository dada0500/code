package com.heima.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.*;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

@WebFilter("/*")
public class WordFilter implements Filter {
    public void destroy () {
    }

    public void doFilter (ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        // 创建动态代理
        ServletRequest request = (ServletRequest) Proxy.newProxyInstance (req.getClass ().getClassLoader (), req.getClass ().getInterfaces (), new InvocationHandler () {
            @Override
            public Object invoke (Object proxy, Method method, Object[] args) throws Throwable {
                if( method.getName ().equals ("getParameter")){
//                    String change = (String) args[0];
//                    String change = "change";
//                    return method.invoke (req,change);
                    return method.invoke (req,"name");
//                    return change;


      /*              String value = (String) method.invoke (req, args);

                    if(value != null){
                        for (String s : list) {
                            if(value.contains (s)){
                                value = value.replaceAll (s,"***");
                            }
                        }
                    }
                    return value;*/
                }
                return method.invoke (req,args);
            }
        });

        chain.doFilter (request,resp);


/*        // Proxy
        ServletRequest newReq = (ServletRequest) Proxy.newProxyInstance (req.getClass ().getClassLoader (), req.getClass ().getInterfaces (), new InvocationHandler () {
            @Override
            public Object invoke (Object proxy, Method method, Object[] args) throws Throwable {
//                proxy.
                if(method.getName ().equals ("getParameter")) {
                    String value = (String) method.invoke (req, args);
                    if(value != null){
                        for (String str : list) {
                            if(value.equals (str)){
                                value.replaceAll (str,"***");
                            }
                        }
                    }
                    return  value;
                }
                //判断方法名是否是 getParameterMap

                //判断方法名是否是 getParameterValue

                return method.invoke(req,args);

            }
        });
        chain.doFilter (newReq, resp);*/
    }

    // 存入list
    List<String> list = new ArrayList<> ();
    public void init (FilterConfig config) throws ServletException {

        try {
            ServletContext servletContext = config.getServletContext ();
//            String realPath = servletContext.getRealPath ("/WEB-INF/classes/word.properties");
            InputStream is = servletContext.getResourceAsStream ("/WEB-INF/classes/word.properties");
            BufferedReader br = new BufferedReader (new InputStreamReader (is ,"utf-8"));

            String line;
            while ((line = br.readLine ()) != null){
                list.add (line);
            }
            br.close ();
        } catch (IOException e) {
            e.printStackTrace ();
        }



/*        // 获取 servletContext对象
        System.out.println ("config: "+ config);
        ServletContext servletContext = config.getServletContext ();
        System.out.println ("servletContext: "+ servletContext);
        System.out.println ("config.getFilterName (): "+ config.getFilterName ());
        System.out.println ("config.getInitParameterNames (): "+ config.getInitParameterNames ());
        // 获取真实路径
        String realPath = servletContext.getRealPath ("/WEB-INF/classes/word.properties");

        // 加载文件
        try {
            BufferedReader br = new BufferedReader (new FileReader (realPath));


            String line;

            while ((line = br.readLine ()) != null){
                list.add (line);
            }

            br.close ();
        } catch (Exception e) {
            e.printStackTrace ();
        }*/


    }

}
