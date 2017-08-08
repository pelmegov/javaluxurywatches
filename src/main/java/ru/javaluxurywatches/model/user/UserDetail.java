package ru.javaluxurywatches.model.user;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "user_detail")
@EqualsAndHashCode(exclude = {"id", "user"})
@ToString(exclude = {"id", "gender", "address", "city", "country", "postcode", "dayOfBirth"})
public class UserDetail implements Persistable<Long> {

    public enum Gender {
        Male, Female;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String address;

    private String city;

    private String country;

    private Long postcode;

    @Temporal(TemporalType.DATE)
    private Date dayOfBirth;

    @OneToOne
    @JoinColumn(name = "id")
    private User user;

    @Override
    public boolean isNew() {
        return getId() == null &&
                this.getId() == null;
    }
}
