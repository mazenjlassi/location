package com.example.tp1spring.Services;

import com.example.tp1spring.Repository.ProviderRepository;
import com.example.tp1spring.entity.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProviderService {
    @Autowired
    static ProviderRepository providerRepo;
    public List<Provider> getAllProviders() {
        return providerRepo.findAll();
    }
    public Provider getProviderByID(Integer id){
        return providerRepo.findById(id).get();
    }
    public Provider updateProvider(Provider provider){
        return providerRepo.saveAndFlush(provider);
    }
    public static void deleteProvider(Integer id){
        providerRepo.deleteById(id);
    }
}
