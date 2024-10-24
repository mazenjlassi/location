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
public class Category {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int id;
    String title;
    String description;

    @OneToMany(mappedBy = "category",cascade = CascadeType.REMOVE)
    List <Subcategory> subcategoryListe;
}
