package edu.icet.pos.dao.custom;

import edu.icet.pos.dao.CrudDao;
import edu.icet.pos.entity.UserEntity;

import java.util.List;

public interface   UserDao extends CrudDao<UserEntity> {


    List<UserEntity> getAll();

    UserEntity generateNewUserID();
}
