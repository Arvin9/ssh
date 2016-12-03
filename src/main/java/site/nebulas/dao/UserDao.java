package site.nebulas.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import site.nebulas.bean.User;

/**
 * Created by Administrator on 2016/12/3.
 */
@Repository
public class UserDao {
    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return sessionFactory.openSession();
    }

    public void saveUser(User user) throws HibernateException {
        this.getCurrentSession().save(user);
    }
}
