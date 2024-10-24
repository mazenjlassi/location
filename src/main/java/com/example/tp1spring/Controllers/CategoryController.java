package com.example.tp1spring.Controllers;


import com.example.tp1spring.Repository.CategoryRepository;
import com.example.tp1spring.Services.CategoryService;
import com.example.tp1spring.entity.Category;
import com.example.tp1spring.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CategoryController {
    @Autowired
    CategoryService categoryService ;
    @RequestMapping("/addCategory")
    public String addCategory(Model model){
    Category category = new Category();
    model.addAttribute("CategoryForm", category );
    return "new_category";
    }
   @RequestMapping(value = "/saveCategory" , method = RequestMethod.POST)
   public String saveCategory(@ModelAttribute("CategoryForm") Category category) {
         categoryService.createCategory(category);
         return "redirect:/allCategory";
   }
    @RequestMapping("/allCategory")
    public String listecategory(Model model){
        List<Category> listCategory =  categoryService.getallCategory();
        model.addAttribute("listCategory", listCategory);
        return "liste_category";
    }

    @GetMapping("deleteCategory/{id}")
    public String deleteCategory(@PathVariable("id")Integer id){
        categoryService.deletecategory(id);
        return "redirect:/allCategory";
    }




}