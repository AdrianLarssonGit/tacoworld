package com.tacoworld;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.tacoworld.Ingredient;
import com.tacoworld.Ingredient.Type;

@Component
public class IngredientByIdConverter implements Converter<String, Ingredient>{
	

	private IngredientRepository ingredientRepo;
	
	@Autowired
	public IngredientByIdConverter(IngredientRepository ingredientRepo) {
		this.ingredientRepo = ingredientRepo;
		
	}
	@Override
	public Ingredient convert(String id) {
		// TODO Auto-generated method stub
		return ingredientRepo.findById(id).orElse(null);
	}

}
