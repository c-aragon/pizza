package com.example.pizzaorder.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "hero")
public class Hero {

    /**
     * Id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * Name.
     */
    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "tel", length = 20)
    private String tel;

    /**
     * Get id.
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * Set id.
     * @param id id
     */
    public void setId(final long id) {
        this.id = id;
    }

    /**
     * Get name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Set name.
     * @param name name
     */
    public void setName(final String name) {
        this.name = name;
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
