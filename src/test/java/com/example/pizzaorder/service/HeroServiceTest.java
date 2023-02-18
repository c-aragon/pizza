package com.example.pizzaorder.service;

import com.example.pizzaorder.entity.Hero;
import com.example.pizzaorder.repository.HeroRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@Transactional
@SpringBootTest
public class HeroServiceTest {

    @Autowired
    private HeroService heroService;

    @Autowired
    private HeroRepository heroRepository;

    @Test
    public void createHeroTest() {
        //Preparing data
        Hero hero = new Hero();
        hero.setId(1L);
        hero.setName("Super hero for test");

        //Execute test
        Hero heroResponse = heroService.createHero(hero);

        Hero newHero = heroRepository.findById(heroResponse.getId()).get();

        //Check result
        Assertions.assertEquals(hero.getId(), newHero.getId());
        Assertions.assertEquals(hero.getName(), newHero.getName());

    }

    @Test
    public void getAllHeroTest() {
        //Execute test
        List<Hero> heroResponse = heroService.getAllHeros();

        //Check result
        Assertions.assertEquals(4, heroResponse.size());
    }

}
