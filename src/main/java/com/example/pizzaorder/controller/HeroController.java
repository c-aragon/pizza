package com.example.pizzaorder.controller;

import java.util.List;

import com.example.pizzaorder.dto.HeroDto;

/**
 * Interface for super hero
 * @author Charly
 *
 */
public interface HeroController {

	/**
	 * Create a new superhero.
	 * @param heroDto Superhero data.
	 * @return Object with superhero data.
	 */
	HeroDto createHero(HeroDto heroDto);

	/**
	 * Get Hero by id.
	 * @param id Id's superhero.
	 * @return Object with superhero data.
	 */
	HeroDto getHero(long id);

	/**
	 * Get heroes.
	 * @return A list with superheroes.
	 */
	List<HeroDto> getHeroes();

	/**
	 * Update a super hero.
	 * @param id Id of superhero.
	 * @param heroDto Superhero data.
	 * @return Object with superhero data.
	 */
	HeroDto updateHero(long id, HeroDto heroDto);

	/**
	 * Logical delete of superhero.
	 * @param id Id of superhero
	 * @return Object with superhero data.
	 */
	HeroDto deleteHero(long id);

}
