package org.acme.PancheEntity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity //use this since this is data base entity
/* Extending PanacheEntity creates id already*/
public class MoviesEntity extends PanacheEntity {

    @Column(length = 100)
    public String title;

    @Column(length = 200)
    public String description;
    String director;

   public String country;

}
