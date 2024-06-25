package edu.icet.pos.bo.custom;

import edu.icet.pos.dto.Product;

public interface ProductBo {

    boolean addProduct(Product dto);

    boolean updateProduct(String id);
}
