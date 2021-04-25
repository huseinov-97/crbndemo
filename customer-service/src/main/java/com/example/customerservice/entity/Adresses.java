package com.example.customerservice.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Adresses {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String address;

    @ManyToOne
    private Customer customer;
}
