package ru.javaluxurywatches.model.user.profile;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
@Table(name = "message_request")
@EqualsAndHashCode(exclude = {"id"})
public class MessageRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String messageRequest;

    @ManyToOne
    @PrimaryKeyJoinColumn
    private Support support;
}
