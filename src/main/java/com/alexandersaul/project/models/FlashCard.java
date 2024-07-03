package com.alexandersaul.project.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "FlashCard")

public class FlashCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_flashCard")
    private long id;
    @Column(name = "descriReversa")
    private String descriReversa;
    @Column(name = "descriInversa")
    private String descriInversa;
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;
    @Temporal(TemporalType.DATE)
    private Date fechaRevision;
    private double difficultFactor;


}
