package edu.icet.pos.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Order {

    private String o_id;
    private String items;
    private String payment_type;
    private Double total_cost;
}
