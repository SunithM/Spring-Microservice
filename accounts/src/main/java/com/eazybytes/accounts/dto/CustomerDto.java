package com.eazybytes.accounts.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class CustomerDto {

    @NotEmpty(message="Name can't be null or empty")
    @Size(min=5,max=20, message="Name must be between 5 and 20 characters")
    private String name;

    @NotEmpty(message = "Email can't be null or empty")
    @Email(message = "Invalid email address")
    private String email;

    @Pattern(regexp = "[0-9]{10}", message = "Invalid mobile number")
    private String mobileNumber;

    private AccountsDto accountsDto;
}
