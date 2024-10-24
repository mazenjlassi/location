package com.example.tp1spring.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level =  AccessLevel.PRIVATE)
public class Provider extends User {

    String matricule;
    String service;
    String company;

    @OneToMany(mappedBy = "provider",cascade = CascadeType.REMOVE)
    List<Product> products;
}
