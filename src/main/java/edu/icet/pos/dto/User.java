package edu.icet.pos.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class User {

    private String u_id;
    private String password;
    private String username;
    private String eMail;
}
