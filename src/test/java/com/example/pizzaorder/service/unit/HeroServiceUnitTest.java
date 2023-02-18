package com.example.pizzaorder.service.unit;

import com.example.pizzaorder.entity.Hero;
import com.example.pizzaorder.repository.HeroRepository;
import com.example.pizzaorder.service.impl.HeroServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest
public class HeroServiceUnitTest {

    //Estas diciendo que vas a mockear este objeto (es decir le vas a indicar que hacer)
    @Mock
    private HeroRepository heroRepository;

    @InjectMocks
    private HeroServiceImpl heroService;

    @Test
    public void createHeroTest() {
        //Preparing data
        Hero hero = new Hero();
        hero.setId(1L);
        hero.setName("Super hero for test");

        //Aca entra mockito. Le dices que cuando ejecutes el metodo save del repository te retorne el objeto hero
        when(heroRepository.save(any(Hero.class))).thenReturn(hero);

        //Execute test
        Hero heroResponse = heroService.createHero(hero);

        //Check result
        Assertions.assertEquals(1L, heroResponse.getId());
        Assertions.assertEquals("Super hero for test", heroResponse.getName());
    }

}
