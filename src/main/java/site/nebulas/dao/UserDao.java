package site.nebulas.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import site.nebulas.bean.User;
import java.util.List;

/**
 * Created by Administrator on 2016/12/3.
 */
@Repository
@Transactional
public class UserDao extends HibernateDaoSupport{

    public void saveUser(User user) {
        System.out.println("UserDao");
        this.getHibernateTemplate().save(user);
    }

    public List<User> getUserInfo(User user) {
        String hql = "FROM user";
        return (List<User>) this.getHibernateTemplate().find(hql,null);
    }
}
