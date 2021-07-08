package com.tacoworld;

import java.util.Optional;
import com.tacoworld.Ingredient;


public interface IngredientRepository {
	
	Iterable<Ingredient> findAll();
	
	Optional<Ingredient> findById(String id);
	
	Ingredient save(Ingredient ingredient);
	
}
