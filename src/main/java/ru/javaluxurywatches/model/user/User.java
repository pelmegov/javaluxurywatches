package ru.javaluxurywatches.model.user;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.domain.Persistable;
import ru.javaluxurywatches.annotation.Phone;
import ru.javaluxurywatches.model.blog.Post;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Data
@Entity
@Table(name = "\"USER\"")
@EqualsAndHashCode(exclude = {"id", "posts", "roles"})
@ToString(exclude = {"id", "login", "firstName", "lastName", "email", "posts", "roles"})
public class User implements Persistable<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, updatable = false)
    private String login;

    private String password;

    @NotEmpty
    private String firstName;

    private String lastName;

    @Email
    @Column(unique = true)
    private String email;

    @Phone
    @Column(unique = true)
    private Long phone;

    private Boolean isActive;

    @OneToMany(mappedBy = "author", fetch = FetchType.LAZY)
    private Set<Post> posts;

    @ManyToMany
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_detail_id")
    private UserDetail userDetail;

    @Override
    public boolean isNew() {
        return getId() == null &&
                this.getId() == null;
    }
}
