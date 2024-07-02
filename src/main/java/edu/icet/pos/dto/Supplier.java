package edu.icet.pos.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Supplier {

    private String s_id;
    private String s_name;
    private String company;
    private String eMail;
}
