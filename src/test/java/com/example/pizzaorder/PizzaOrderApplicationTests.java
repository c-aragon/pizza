package com.example.pizzaorder;

import com.example.pizzaorder.controller.impl.SuperHeroControllerImpl;
import com.example.pizzaorder.service.impl.HeroServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PizzaOrderApplicationTests {

    @Autowired
    private SuperHeroControllerImpl superHeroController;

    @Autowired
    private HeroServiceImpl heroService;

    @Test
    void contextLoads() {
        Assertions.assertThat(superHeroController).isNotNull();
        Assertions.assertThat(heroService).isNotNull();
    }

}
