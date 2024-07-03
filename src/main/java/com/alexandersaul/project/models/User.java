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
@Table(name = "Users")
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_user")
    private long id;
    @Column(name="name" , length = 50 , unique = true)
    private String userName;
    @Column(name = "password")
    private String password;
    @OneToMany (mappedBy = "user")
    private List<Topic> topics;

}