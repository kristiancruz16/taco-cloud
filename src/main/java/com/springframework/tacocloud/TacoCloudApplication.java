package com.springframework.tacocloud;

import com.springframework.tacocloud.domains.ingredient.Ingredient;
import com.springframework.tacocloud.domains.ingredient.IngredientRepository;
import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import static com.springframework.tacocloud.domains.ingredient.Ingredient.Type.*;
import static org.springframework.boot.SpringApplication.*;

@SpringBootApplication
public class TacoCloudApplication {

    public static void main(String[] args) {

        run(TacoCloudApplication.class, args);
    }
}
