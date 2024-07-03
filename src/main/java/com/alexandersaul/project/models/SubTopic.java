package com.alexandersaul.project.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "sub_topic")
public class SubTopic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_Subtopic")
    private long id;
    @Column(name="name" , length = 50)
    private String name;
    @ManyToOne
    @JoinColumn(name = "topic_id_topic")
    private Topic topic;

}
