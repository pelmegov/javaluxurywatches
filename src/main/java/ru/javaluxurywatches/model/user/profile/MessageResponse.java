package ru.javaluxurywatches.model.user.profile;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
@Table(name = "message_response")
@EqualsAndHashCode(exclude = {"id"})
public class MessageResponse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String messageResponse;

    @ManyToOne
    @PrimaryKeyJoinColumn
    private Support support;
}
