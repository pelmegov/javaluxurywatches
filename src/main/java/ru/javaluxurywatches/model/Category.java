package ru.javaluxurywatches.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "\"CATEGORY\"")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String title;

    private String link;

}
