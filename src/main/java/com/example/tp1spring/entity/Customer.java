package com.example.tp1spring.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.core.serializer.Serializer;

import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Customer extends User{

    String adress;
    String city;
    @ManyToOne
    @JoinColumn (name = "id_order")
    Order order;

}
