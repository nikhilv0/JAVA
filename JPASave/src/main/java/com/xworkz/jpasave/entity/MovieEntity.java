package com.xworkz.jpasave.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@EqualsAndHashCode
@ToString
@AllArgsConstructor
@Setter
@Getter

@Entity
@Table(name = "save")
public class MovieEntity {

    public MovieEntity() {
        System.out.println("MovieEntity Constructor");
    }

    @Id
    private int Id;

    @Column(name = "movie_name")
    private String movieName;

    private int price;
}
