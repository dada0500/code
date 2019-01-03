package cn.itcast.travel.service.impl;

import cn.itcast.travel.dao.UserDao;
import cn.itcast.travel.dao.impl.UserDaoImpl;
import cn.itcast.travel.domain.User;
import cn.itcast.travel.service.UserService;
import cn.itcast.travel.util.MailUtils;
import cn.itcast.travel.util.UuidUtil;

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl ();

    @Override
    public boolean registerUser (User user) {
        // 查找用户名是否存在
        User u = userDao.findUserByUsername (user.getUsername ());
        // 用户名已存在，返回false
        if (u != null) {
            return false;
        }

        // 用户名不存在，注册用户
        // 设置user激活标记
        user.setStatus ("N");
        // 设置user激活码
        user.setCode (UuidUtil.getUuid ());
        // 注册用户
        userDao.register(user);
        // 发送激活邮件
        MailUtils.sendMail (user.getEmail (), "点击激活<a href='http://localhost/travel/active?code=" + user.getCode () + "'>黑马旅游网</a>账号", "激活账号");
        // 返回注册成功
        return true;
    }

    @Override
    public boolean activeUser (String code) {
        // 查找code是否存在
        User user = userDao.findUserByCode(code);
        // code不存在，返回false
        if(user == null){
            return false;
        }
        // code存在，激活用户
        boolean flag = userDao.activeUser(user);
        if(flag){
            return true;
        }
        return false;
    }

    @Override
    public User login (String username, String password) {
        // 根据用户名、密码查找用户
        User user = userDao.finUserByUsernameAndPassword(username,password);
        return user;
    }


}
