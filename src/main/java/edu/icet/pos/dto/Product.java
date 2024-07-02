package edu.icet.pos.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Product {

    private String p_id;
    private String p_name;
    private String category;
    private String size;
    private Integer price;
    private Integer qty;
}
