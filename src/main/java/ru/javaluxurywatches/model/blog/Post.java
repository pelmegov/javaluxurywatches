package ru.javaluxurywatches.model.blog;

import lombok.Data;
import org.hibernate.annotations.Generated;
import ru.javaluxurywatches.model.user.User;

import javax.persistence.*;
import java.util.Date;

import static org.hibernate.annotations.GenerationTime.ALWAYS;
import static org.hibernate.annotations.GenerationTime.INSERT;

@Data
@Entity
@Table(name = "\"POST\"")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String title;

    @Column(unique = true)
    private String link;

    private Boolean isActive;

    private String imageLink;

    private Boolean isSlider;

    @Column(columnDefinition = "TEXT")
    private String text;

    @ManyToOne
    @PrimaryKeyJoinColumn
    private User author;

    @Generated(INSERT)
    private Date createdDate;

    @Generated(ALWAYS)
    private Date updatedDate;

}

