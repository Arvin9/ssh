package site.nebulas.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import site.nebulas.bean.User;

/**
 * Created by Administrator on 2016/12/3.
 */
@Repository
@Transactional
public class UserDao extends HibernateDaoSupport{

    @Autowired
    private SessionFactory sessionFactory;

    //获取和当前线程绑定的Seesion
    private Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    public void saveUser(User user) throws HibernateException {
        User user1 = new User();
        user1.setName("hahaha");
        System.out.println("UserDao");
        this.getSession().save(user1);
    }
}
