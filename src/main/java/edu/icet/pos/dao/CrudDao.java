package edu.icet.pos.dao;

import edu.icet.pos.model.User;

public interface CrudDao <T> extends SuperDao{

    boolean save(T dto);

    boolean delete(String id);
}
