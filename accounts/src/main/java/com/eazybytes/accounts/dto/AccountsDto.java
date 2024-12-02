package com.eazybytes.accounts.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class AccountsDto {

    @NotEmpty(message="Account number can't be null or empty")
    @Pattern(regexp = "[0-9]{9}", message = "Invalid account number")
    private long accountNumber;

    @NotEmpty(message="Account type can't be null or empty")
    private String accountType;

    @NotEmpty(message="Branch address can't be null or empty")
    private String branchAddress;
}
