package dev.holoparts.purchaseorder.login.entity;

import dev.holoparts.purchaseorder.login.ROLE;
import jakarta.persistence.*;

@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "num")
    private Long num;

    @Column(name = "userid", nullable = false)
    private String userid;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "ROLE", nullable = true)
    @Enumerated(EnumType.STRING)
    private ROLE role;

}
