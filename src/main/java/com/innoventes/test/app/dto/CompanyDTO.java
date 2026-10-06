package com.innoventes.test.app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class CompanyDTO {

	@NotBlank(message = "Company name is mandatory")

	@Size(min =5, message="company name must be at least 5 characters")

	private String companyName;

	@NotBlank(message = "Company name is mandatory")

	@Email(message = "Invalid email format")

	private String email;

	@Min(value =0,message = "Strength must be zero or positive")

	private Integer strength;

	private String webSiteURL;
}
