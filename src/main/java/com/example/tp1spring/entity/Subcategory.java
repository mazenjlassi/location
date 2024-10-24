package com.example.tp1spring.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level =  AccessLevel.PRIVATE)
public class Subcategory {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int id;
    String title;
    String description;

    @ManyToOne
    @JoinColumn(name = "id_category")
    Category category;

    @ManyToOne
    @JoinColumn(name = "id_Product")
    Product product;

}
