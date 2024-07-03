package com.alexandersaul.project.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "Topic")
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_topic")
    private long id;
    @Column(name="name" , length = 50)
    private String name;
    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;
    @OneToMany (mappedBy = "topic")
    private List<SubTopic> subTopicList;

}