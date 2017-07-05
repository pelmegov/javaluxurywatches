package ru.javaluxurywatches.model.user;

import lombok.*;
import ru.javaluxurywatches.model.blog.Post;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Getter
@Setter
@Table(name = "\"USER\"")
@EqualsAndHashCode(exclude = {"id", "posts", "roles"})
@ToString(exclude = {"id", "posts", "roles"})
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

    @ManyToMany
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }
}
