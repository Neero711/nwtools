package ru.neero.userservice.model;


import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private UUID userid;
    private String email;

}
