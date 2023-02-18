package com.example.pizzaorder.service.impl;

import com.example.pizzaorder.entity.Hero;
import com.example.pizzaorder.repository.HeroRepository;
import com.example.pizzaorder.service.HeroService;
import com.example.pizzaorder.service.NumberValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeroServiceImpl implements HeroService {

    private final HeroRepository heroRepository;

    private final NumberValidationService numberValidationService;

    @Autowired
    public HeroServiceImpl(final HeroRepository heroRepository,
                           final NumberValidationService numberValidationService) {
        this.heroRepository = heroRepository;
        this.numberValidationService = numberValidationService;
    }

    /**
     * Create a new superhero.
     *
     * @param hero Superhero data.
     * @return Object with superhero data.
     */
    @Override
    public Hero createHero(final Hero hero) {
        return heroRepository.save(hero);
    }

    @Override
    public List<Hero> getAllHeros() {
        return heroRepository.findAll();
    }
}
