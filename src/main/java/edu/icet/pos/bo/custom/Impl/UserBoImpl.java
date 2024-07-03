package edu.icet.pos.bo.custom.Impl;

import edu.icet.pos.bo.custom.UserBo;
import edu.icet.pos.dao.DaoFactory;
import edu.icet.pos.dao.custom.UserDao;
import edu.icet.pos.dto.User;
import edu.icet.pos.entity.UserEntity;
import edu.icet.pos.util.DaoType;
import org.modelmapper.ModelMapper;

public class UserBoImpl implements UserBo {

    private UserDao userDao = DaoFactory.getInstance().getDao(DaoType.USER);

    @Override
    public boolean addUser(User dto) {

        return userDao.save(new ModelMapper().map(dto, UserEntity.class));
    }

    @Override
    public boolean deleteUser(String id) {

        return false;
    }
}
