package com.msf.ValidationExample.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserRequest
{
    @NotNull (message = "Username should not be empty")
    private String name;
    @Email (message = "Invalid Email")
    private String email;
    @Pattern(regexp = "^\\d{10}$",message = "invalid mobile number entered ")
    private String mobile;
    private String gender;
    @Min(18)
    @Max(25)
    private int age;
    @NotBlank
    private String nationality;
}
