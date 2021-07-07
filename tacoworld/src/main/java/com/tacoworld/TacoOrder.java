package com.tacoworld;

import java.util.List;


import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.*;

//import org.hibernate.validator.constraints.CreditCardNumber;

import java.util.ArrayList;
import lombok.Data;


@Data
public class TacoOrder {
	@NotBlank(message="Delivery name is required")
	private String deliveryName;
	
	private String deliveryStreet;

	private String deliveryCity;

	private String deliveryState;

	private String deliveryZip;
	//@CreditCardNumber(message="Name must be at least 5 char long")
	private String ccNumber;
	//@Pattern(regexp="^(0[1-9]|1[0-2])([\\/])([1-9][0-9])$",message="Wrong pattern MM/YY is needed")
	private String ccExpiration;
	//@Digits(integer=3, fraction=0,message="Invalid CCV")
	private String ccCVV;
	
	private List<Taco> tacos = new ArrayList<>();

	
	public void addTaco(Taco taco) {
		this.tacos.add(taco);
		}
}
