package com.example.tp1spring.Controllers;

import com.example.tp1spring.Services.ProviderService;
import com.example.tp1spring.entity.Category;
import com.example.tp1spring.entity.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProviderController {
    @Autowired
    ProviderService providerService;

    @RequestMapping("/addProvider")
    public String addProvider(Model model) {
        Provider provider = new Provider();
        model.addAttribute("provider", provider);
        return "add_Provider";
    }

    @RequestMapping(value = "/saveProvider",method = RequestMethod.POST)
    public String saveProvider(@ModelAttribute("ProviderForm")Provider provider) {
        providerService.getAllProviders().add(provider);
        return "redirect:/allProviders";
    }
    @RequestMapping("/allProvider")
    public String listeprovider(Model model){
        List<Provider> listProvider =  providerService.getAllProviders();
        model.addAttribute("listProvider", listProvider);
        return "liste_provider";
    }

    @GetMapping("deleteProvider/{id}")
    public String deleteProvider(@PathVariable("id")Integer id){
        ProviderService.deleteProvider(id);
        return "redirect:/allCategory";
    }


}