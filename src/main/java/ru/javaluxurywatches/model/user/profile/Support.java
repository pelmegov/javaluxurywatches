package ru.javaluxurywatches.model.user.profile;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Data
@Entity
@Table(name = "support")
@EqualsAndHashCode(exclude = {"id"})
public class Support {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "user_id")
    private Long userId;

    @Temporal(TemporalType.DATE)
    @Column(name = "current_data")
    private Date currentDate;

    @OneToMany(mappedBy = "support", fetch = FetchType.LAZY)
    private Set<MessageRequest> messageRequest;

    @OneToMany(mappedBy = "support", fetch = FetchType.LAZY)
    private Set<MessageResponse> messageResponse;

    @Column(name = "is_close")
    private boolean isClose;
}
