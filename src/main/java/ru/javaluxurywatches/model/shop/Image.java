package ru.javaluxurywatches.model.shop;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "\"IMAGE\"")
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String link;

    private String alt;

    @ManyToOne
    @PrimaryKeyJoinColumn
    private Product product;
}
