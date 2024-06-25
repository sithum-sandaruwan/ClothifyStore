package edu.icet.pos.dao.custom.impl;

import edu.icet.pos.dao.custom.UserDao;
import edu.icet.pos.entity.UserEntity;

public class UserDaoImpl implements UserDao {

    @Override
    public boolean save(UserEntity dto) {
        return false;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }
}
