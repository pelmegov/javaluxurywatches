package ru.javaluxurywatches.model.shop;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import ru.javaluxurywatches.util.ConstantUtil;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.math.BigDecimal;
import java.math.RoundingMode;
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

    @Min(0) @Max(100)
    private Integer discount;

    private Boolean isHit;

    public BigDecimal getPrice() {
        if (discount > 0) {
            BigDecimal discountDecimal = BigDecimal.valueOf(discount);
            return price.subtract(price.multiply(discountDecimal).divide(ConstantUtil.ONE_HUNDRED, 0, RoundingMode.CEILING));
        }
        return price;
    }

    public BigDecimal getPriceWithoutDiscount() {
        return price;
    }

    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
    @Fetch(FetchMode.JOIN)
    private Set<Image> images;

    @ManyToMany(mappedBy="products")
    @Fetch(FetchMode.JOIN)
    private Set<Category> categories;

}
