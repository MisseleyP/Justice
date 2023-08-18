package com.example.jwtexample.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "User")
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "user_id")
    private Long user;

    @Column(name = "username")
    private String userName;

    @Column(name = "userFirstName")
    private String userFirstName;

    @Column(name = "userLastName")
    private String userLastName;

    @Column(name = "userPassword")
    private String userPassword;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "USER_ROLE",
            joinColumns = {
                    @JoinColumn(name = "USER_ID")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "ROLE_ID")
            }
    )
    private Set<Role> role;
}
