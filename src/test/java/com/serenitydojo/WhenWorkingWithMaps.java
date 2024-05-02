package com.serenitydojo;

import com.serenitydojo.model.FoodType;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static com.serenitydojo.model.FoodType.*;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Exercises with Maps
 * - maps let you associate a value with some other value
 * - maps can work with different types, e.g. enums to strings
 * - you can list all the keys in a map
 * - you can list all the values in a map
 */

// When working with Maps in Java
public class WhenWorkingWithMaps {

    // Maps let you associate a value with some other value
    @Test
    public void creatingANewSet() {
        Map<String, String> countryCapitals = new HashMap<>();
        // TODO: Create a new map and add the following associations:
        //  UK -> London
        //  France -> Paris
        //  Germany -> Berlin
        countryCapitals.put("UK","London");
        countryCapitals.put("France","Paris");
        countryCapitals.put("Germany","Berlin");

        assertThat(countryCapitals.get("UK")).isEqualTo("London");
        assertThat(countryCapitals.get("France")).isEqualTo("Paris");
        assertThat(countryCapitals.get("Germany")).isEqualTo("Berlin");
    }

    // maps can work with different types, e.g. enums to strings
    @Test
    public void mapWithDifferentTypes() {
        Map<String, FoodType> favoriteFood = new HashMap<>();
        // TODO: Create a new map and add the following associations:
        //  "cat" -> TUNA
        //  "dog" -> DELUXE_DOG_FOOD
        //  "hamster" -> LETTUCE
        favoriteFood.put("cat",TUNA);
        favoriteFood.put("dog",DELUXE_DOG_FOOD);
        favoriteFood.put("hamster",LETTUCE);

        assertThat(favoriteFood.get("cat")).isEqualTo(TUNA);
        assertThat(favoriteFood.get("dog")).isEqualTo(DELUXE_DOG_FOOD);
        assertThat(favoriteFood.get("hamster")).isEqualTo(LETTUCE);
    }

    // We can create a map more easily with the Map.of() method
    @Test
    public void usingMapOf() {
        Map<String, FoodType> favoriteFood = null;
        // TODO: Create a new map and add the following associations using Map.of()
        //  "cat" -> TUNA
        //  "dog" -> DELUXE_DOG_FOOD
        //  "hamster" -> LETTUCE
        favoriteFood = Map.of("cat",TUNA,
                "dog",DELUXE_DOG_FOOD,
                "hamster",LETTUCE);

        assertThat(favoriteFood.get("cat")).isEqualTo(TUNA);
        assertThat(favoriteFood.get("dog")).isEqualTo(DELUXE_DOG_FOOD);
        assertThat(favoriteFood.get("hamster")).isEqualTo(LETTUCE);
    }


    // We can check that a map contains a specified key
    @Test
    public void containsKey() {
        Map<String, FoodType> favoriteFood = Map.of(
                "cat", TUNA,
                "dog", DELUXE_DOG_FOOD,
                "hamster", LETTUCE);

        // TODO: Check that the map contains a key of "dog"
        boolean containsDog = favoriteFood.containsKey("dog");

        assertThat(containsDog).isTrue();
    }

    // We can check that a map contains a specified value
    @Test
    public void containsValue() {
        Map<String, FoodType> favoriteFood = Map.of(
                "cat", TUNA,
                "dog", DELUXE_DOG_FOOD,
                "hamster", LETTUCE);

        // TODO: Check that the map contains a value of TUNA
        boolean containsTuna = favoriteFood.containsValue(TUNA);

        assertThat(containsTuna).isTrue();
    }
}
