package com.example.tp1spring.Repository;

import com.example.tp1spring.entity.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProviderRepository extends JpaRepository<Provider ,Integer> {
}
