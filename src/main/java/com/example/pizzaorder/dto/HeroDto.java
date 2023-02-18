package com.example.pizzaorder.dto;

/**
 * Super hero dto class.
 * @author Charly
 *
 */
public class HeroDto {
	/**
	 * Id of super hero.
	 */
	private Long id;
	
	/**
	 * Super hero name.
	 */
	private String name;

	/**
	 * Superhero telephone.
	 */
	private String tel;

	/**
	 * Get superhero name.
	 * @return superhero name.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Set superhero name.
	 * @param name name's superhero.
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * Get superhero id.
	 * @return superhero id.
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Set superhero id.
	 * @param id id's superhero.
	 */
	public void setId(final long id) {
		this.id = id;
	}

	/**
	 * Get tel.
	 * @return tel
	 */
	public String getTel() {
		return tel;
	}

	/**
	 * Set tel.
	 * @param tel telephone
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}
}
