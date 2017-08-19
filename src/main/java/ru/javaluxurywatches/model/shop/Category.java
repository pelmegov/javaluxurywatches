package ru.javaluxurywatches.model.shop;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "\"CATEGORY\"")
@EqualsAndHashCode(exclude = {"id", "products"})
@ToString(exclude = {"id", "products"})
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(unique = true)
    private String link;

    @ManyToMany(fetch = FetchType.LAZY)
    @Fetch(FetchMode.JOIN)
    @JoinTable(name = "category_product", joinColumns = @JoinColumn(name = "category_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id"))
    private Set<Product> products;
}
