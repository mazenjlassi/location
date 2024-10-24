package com.example.tp1spring.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "orderTable")
public class Order {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int id;
    String ref;
    float price;
    Date date;

    @ManyToMany(mappedBy = "orders")
    List<Product> products=new ArrayList<Product>();

    @OneToMany(mappedBy = "order",cascade = CascadeType.REMOVE)
    List<Customer>  customers;
}
