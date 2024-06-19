package edu.icet.pos.bo.custom;

import edu.icet.pos.model.Product;

public interface ProductBo {

    boolean addProduct(Product dto);

    boolean updateProduct(String id);
}
