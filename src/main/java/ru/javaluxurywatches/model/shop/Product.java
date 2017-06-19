package ru.javaluxurywatches.model.shop;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Data
@Entity
@Table(name = "\"PRODUCT\"")
@EqualsAndHashCode(exclude = {"id", "categories", "images"})
@ToString(exclude = {"id", "categories", "images"})
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(columnDefinition = "TEXT")
    private String text;

    private BigDecimal price;

    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
    @Fetch(FetchMode.JOIN)
    private Set<Image> images;

    @ManyToMany(mappedBy="products")
    @Fetch(FetchMode.JOIN)
    private Set<Category> categories;

}
