package com.example.tp1spring.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level =  AccessLevel.PRIVATE)
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int id;
    String name;
    float price;
    String description;

    @ManyToOne
    @JoinColumn (name = "id_provider")
    Provider provider;

    @OneToMany(mappedBy = "product",cascade = CascadeType.REMOVE)
    List<Subcategory>subcategories;


    @ManyToMany
    @JoinTable(name = "product_order",
            joinColumns = @JoinColumn(name = "id_product"),
            inverseJoinColumns =@JoinColumn(name = "id_order"))
    List<Order>orders;
}
