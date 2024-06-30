package edu.icet.pos.dao.custom.impl;

import edu.icet.pos.dao.custom.UserDao;
import edu.icet.pos.entity.UserEntity;
import edu.icet.pos.util.HibernateUtil;
import org.hibernate.Session;

public class UserDaoImpl implements UserDao {

    @Override
    public boolean save(UserEntity dto) {

        Session session = HibernateUtil.getSession();
        session.getTransaction().begin();
        session.persist(dto);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }
}
