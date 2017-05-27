package ru.javaluxurywatches.model.user;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import ru.javaluxurywatches.model.blog.Post;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "\"USER\"")
@EqualsAndHashCode(exclude = {"id", "posts"})
@ToString(exclude = {"id", "posts"})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String login;

    private String password;

    private String firstName;

    private String lastName;

    @OneToMany(mappedBy = "author", fetch = FetchType.LAZY)
    private Set<Post> posts;

}
