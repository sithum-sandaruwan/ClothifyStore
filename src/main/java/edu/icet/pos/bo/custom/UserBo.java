package edu.icet.pos.bo.custom;

import edu.icet.pos.dto.User;

public interface UserBo {

    boolean addUser(User dto);

    boolean deleteUser(String id);
}
