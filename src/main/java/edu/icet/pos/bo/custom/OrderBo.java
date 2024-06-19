package edu.icet.pos.bo.custom;

import edu.icet.pos.model.Order;

public interface OrderBo {

    boolean addOrder (Order dto);

    boolean removeOrder (Order id);
}
