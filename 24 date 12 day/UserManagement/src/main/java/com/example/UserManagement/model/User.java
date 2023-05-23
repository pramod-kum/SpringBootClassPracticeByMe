package com.example.UserManagement.model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
public class User {

//  @NotEmpty
    @NotBlank
    private String userId;
    @NotNull
    private String name;
    @Email
    @NotEmpty(message = "Hi Name should not be Empty!!!")
    private String userName;
    private String address;
    @Size(min = 10 , max = 12)
    @Pattern(regexp = "[0-9]+")
    private String phoneNumber;

    //HW : can we put validations on the request object itself
}




