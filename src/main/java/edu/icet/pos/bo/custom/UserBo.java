package edu.icet.pos.bo.custom;

import edu.icet.pos.dto.User;

import java.util.List;

public interface UserBo {

     public List<User> getUserDetails() ;

    boolean addUser(User dto);

    boolean deleteUser(String id);

    void generateNewUserID();
}
