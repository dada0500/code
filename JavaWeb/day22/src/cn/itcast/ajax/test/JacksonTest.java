package cn.itcast.ajax.test;

import cn.itcast.ajax.domain.Province;
import cn.itcast.ajax.domain.User;
import cn.itcast.ajax.service.Service;
import cn.itcast.ajax.service.impl.ServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

public class JacksonTest {
    @Test
    public void jTest() throws JsonProcessingException {
        // 1. 创建对象
//        User user = new User ();
        User user1 = new User ("张三1",23,"男",new Date ());
        User user2 = new User ("张三2",23,"男",new Date ());
        User user3 = new User ("张三3",23,"男",new Date ());


        List<User> ps = new ArrayList<> ();
        ps.add (user1);
        ps.add (user2);
        ps.add (user3);

        Map<String,User> pm = new HashMap<> ();
        pm.put (user1.getName (),user1);
        pm.put (user2.getName (),user2);
        pm.put (user3.getName (),user3);

        // 2. 转换
        ObjectMapper objectMapper = new ObjectMapper ();
//        String json = objectMapper.writeValueAsString (user);
//        System.out.println (json); // {"name":"张三","age":23,"gender":"男","birthday":1542347059669}

        // {"name":"张三","age":23,"gender":"男"}
        String json = objectMapper.writeValueAsString (pm);
        System.out.println (json);

    }

    @Test
    public void jToBeanTest2() throws IOException {
        String json = "{\"name\":\"张三\",\"age\":23,\"gender\":\"男\"}";

        // 创建Jackson的核心对象ObjeckMapper
        ObjectMapper objectMapper = new ObjectMapper ();
        User user = objectMapper.readValue (json, User.class);
        Version version = objectMapper.version ();
        System.out.println (user);
        System.out.println (version);
    }


    @Test
    public void jToBeanTest3() throws IOException {// 查询省份列表
        Service service = new ServiceImpl ();
        List<Province> list = service.getProvinces();

        // 创建Jackson的核心对象ObjectMapper
        ObjectMapper objectMapper = new ObjectMapper ();
//        // 转换list为JSON，并写出到响应头
//        response.setContentType ("application/json;charset=utf-8");
//        objectMapper.writeValue (response.getWriter (),list);
        String string = objectMapper.writeValueAsString (list);
        System.out.println (string);
    }


    @Test
    public void jBeanToJson() throws JsonProcessingException {
        User user1 = new User ("张三",23,"男",new Date (11111111));
        User user2 = new User ("张4",24,"男",new Date (22222222));
        User user3 = new User ("张5",25,"男",new Date (33333333));
        User user4 = new User ("张6",26,"男",new Date (44444444));


        // 创建Jacson的核心对象 ObjectMapper
        ObjectMapper objectMapper = new ObjectMapper ();
        String string = objectMapper.writeValueAsString (user1);
        System.out.println (string);

    }
}
