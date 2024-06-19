package edu.icet.pos.bo.custom;

import edu.icet.pos.model.User;

public interface UserBo {

    boolean addUser(User dto);

    boolean deleteUser(String id);
}
