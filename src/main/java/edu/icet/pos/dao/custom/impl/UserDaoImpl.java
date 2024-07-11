package edu.icet.pos.dao.custom.impl;

import edu.icet.pos.dao.custom.UserDao;
import edu.icet.pos.entity.UserEntity;
import edu.icet.pos.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class UserDaoImpl implements UserDao {

    @Override
    public boolean save(UserEntity userDto) {

        Session session = HibernateUtil.getSession();
        session.getTransaction().begin();
        session.persist(userDto);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    @Override
    public List<UserEntity> getAll() {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();

        try {
            String hql;
            hql = "FROM user";
            Query query = session.createQuery(hql);
            List<UserEntity>userEntities = query.list();
            transaction.commit();
            return userEntities;
        }catch (Exception e){
            e.printStackTrace();
            transaction.rollback();
            return null;

        }finally {
            session.close();
        }

    }

    @Override
    public UserEntity generateNewUserID() {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();


        try {
            String hql = "FROM user ORDER BY id DESC LIMIT 1";
            Query<UserEntity> query = session.createQuery(hql, UserEntity.class);

            if (query.list().isEmpty()){
                return new UserEntity();
            }
            return query.list().get(0);

        }catch (Exception e){
            e.printStackTrace();
            transaction.rollback();
            return null;
        }finally {
            session.close();
        }



        


    }
}
