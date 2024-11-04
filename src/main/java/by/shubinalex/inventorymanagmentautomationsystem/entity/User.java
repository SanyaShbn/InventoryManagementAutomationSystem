package by.shubinalex.inventorymanagmentautomationsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long userId;
    private String userLogin;
    private String userPassword;
    private String firstName;
    private String surName;
    private String patrSurName;

    @Enumerated(EnumType.STRING)
    private Role role;
    private String status;
    private String post;
    @Column(nullable=false, unique=true)
    private String email;
    @Column(unique = true)
    private String phoneNumber;
    private LocalDate birthDate;
}
