package edu.icet.pos.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Employee {

    private String employeeID;
    private String e_name;
    private String address;
    private Long phone_number;
    private String e_mail;
}
