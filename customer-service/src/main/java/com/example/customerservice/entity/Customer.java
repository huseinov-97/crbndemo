package com.example.customerservice.entity;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String name;
    private String surname;
    @NotNull
    private String userName;
    @NotNull
    private String password;
    private String balance;

    @OneToMany
    private List<Adresses> adresses;
}
