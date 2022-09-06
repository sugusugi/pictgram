package com.example.pictgram.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.example.pictgram.validation.constraints.PasswordEquals;

import lombok.Data;

@PasswordEquals
@Data
public class UserForm {
    
    @NotEmpty
    @Size(max = 100)
    private String name;

    @NotEmpty
    @Email
    private String email;

    @NotEmpty
    @Size(max = 20)
    private String password;

    @NotEmpty
    @Size(max = 20)
    private String passwordConfirmation;
}
