package site.nebulas.service;

import org.hibernate.HibernateException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.nebulas.action.UserAction;
import site.nebulas.bean.User;
import site.nebulas.dao.UserDao;
import site.nebulas.util.DateUtil;

import java.util.List;

/**
 * Created by Administrator on 2016/12/3.
 */
@Service
public class UserService {
    //日志
    private Logger log = LoggerFactory.getLogger(UserService.class);

    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void saveUser(User user) throws HibernateException {
        log.info("UserService");
        user.setCreateTime(DateUtil.getTime());
        userDao.saveUser(user);
    }


    public List<User> getUserInfo(User user) {
        return userDao.getUserInfo(user);
    }
}
