package ru.javaluxurywatches.model.shop;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Data
@Entity
@Table(name = "\"ITEM\"")
@EqualsAndHashCode(exclude = {"id", "categories", "images"})
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(columnDefinition = "TEXT")
    private String text;

    private BigDecimal price;

    @OneToMany(mappedBy = "item", fetch = FetchType.LAZY)
    private Set<Image> images;

    @ManyToMany(mappedBy="items")
    private Set<Category> categories;

}
