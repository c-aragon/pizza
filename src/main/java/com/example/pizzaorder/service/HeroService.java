package com.example.pizzaorder.service;

import com.example.pizzaorder.entity.Hero;

import java.util.List;

public interface HeroService {

    /**
     * Create a new superhero.
     * @param hero Superhero data.
     * @return Object with superhero data.
     */
    Hero createHero(Hero hero);

    List<Hero> getAllHeros();

}
