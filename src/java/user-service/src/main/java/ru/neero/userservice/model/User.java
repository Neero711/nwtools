package ru.neero.userservice.model;


import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private Long userid;
    private String email;
    private String password;
    private byte accessLevel ;
    private LocalDateTime createdAt;
}
