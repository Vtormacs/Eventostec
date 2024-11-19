package com.eventostec.api.domain.coupom;

import com.eventostec.api.domain.event.Event;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Table(name = "coupom")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Coupom {

    @Id
    @GeneratedValue
    private UUID id;
    private String code;
    private Integer discount;
    private Data valid;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;
}
