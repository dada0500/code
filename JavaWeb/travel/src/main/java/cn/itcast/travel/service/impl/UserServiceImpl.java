package cn.itcast.travel.service.impl;

import cn.itcast.travel.dao.UserDao;
import cn.itcast.travel.dao.impl.UserDaoImpl;
import cn.itcast.travel.domain.User;
import cn.itcast.travel.service.UserService;
import cn.itcast.travel.util.MailUtils;
import cn.itcast.travel.util.UuidUtil;

public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDaoImpl ();

    /**
     * 注册用户
     * @param user
     * @return
     */
    @Override
    public boolean register (User user) {
        // 查找用户是否存在
        User u = userDao.findUser(user);
        // 用户已存在
        if(u != null){
            return false;
        }
        // 不存在则注册用户
        user.setStatus ("N");
        user.setCode (UuidUtil.getUuid ());
        userDao.register(user);
        String msg = "<a href=\"http://localhost/travel/active?status=Y&code=" + user.getCode () + "\">点击激活黑马旅游网</a>";

        MailUtils.sendMail (user.getEmail (),msg,"激活账号");
        return true;
    }

    @Override
    public boolean active (String status , String code) {
        return userDao.active(status,code);
    }

    @Override
    public User findUser (String username, String password) {
        if(username == null || "".equals (username) || password == null || "".equals (password)){
            return null;
        }
        User user = userDao.findUser (username, password);
        return user;
    }
}
