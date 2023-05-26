package dev.jicmu.purchaseorder.login.entity;

import dev.jicmu.purchaseorder.BaseTimeEntity;
import dev.jicmu.purchaseorder.login.ROLE;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Member extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "num")
    private Long num;

    @Column(name = "userid", nullable = false)
    private String userid;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "ROLE", nullable = true)
    @Enumerated(EnumType.STRING)
    private ROLE role;

}
