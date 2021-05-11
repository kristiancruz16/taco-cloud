package com.springframework.tacocloud.domains.ingredient;

import org.springframework.data.repository.CrudRepository;


public interface IngredientRepository extends CrudRepository<Ingredient,String> {
}
