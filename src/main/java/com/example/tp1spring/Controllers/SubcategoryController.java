package com.example.tp1spring.Controllers;

import com.example.tp1spring.Services.SubcategoryService;
import com.example.tp1spring.entity.Category;
import com.example.tp1spring.entity.Subcategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;
import java.util.List;

@Controller
public class SubcategoryController {
    @Autowired
    SubcategoryService subcategoryService;
    @RequestMapping("/addSubcategory")
    public String addSubcategory(Model model){
        Subcategory subcategory =new Subcategory();
        model.addAttribute("SubcategoryForm",subcategory);
        return "new_Subcategory";
    }
    @RequestMapping(value = "/saveSubcategory",method = RequestMethod.POST)
public String saveSubcategory(@ModelAttribute("SubcategoryForm") Subcategory subcategory) {
        subcategoryService.addSubcategory(subcategory);
        return "redirect:/allSubcategory";

}
    @RequestMapping("/allSubcategory")
    public String listesubcategory(Model model){
        List<Subcategory> listSubcategory =  subcategoryService.getAllSubcategory();
        model.addAttribute("listSubcategory", listSubcategory);
        return "liste_subcategory";
    }

    @GetMapping("deleteSubcategory/{id}")
    public String deleteSubcategory(@PathVariable("id")Integer id){
        subcategoryService.deleteSubcategory(id);
        return "redirect:/allSubcategory";
    }


}
