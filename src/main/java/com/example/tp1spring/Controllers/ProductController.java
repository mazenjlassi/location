package com.example.tp1spring.Controllers;

import com.example.tp1spring.Services.ProductService;
import com.example.tp1spring.entity.Category;
import com.example.tp1spring.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.print.DocFlavor;
import java.util.List;


@Controller
public class ProductController {
    @Autowired
    ProductService  productService;
    @RequestMapping("/addProduct")
    public String addProduct(Model model) {
        Product product = new Product();
        model.addAttribute("ProductForm",product);
     return "new_product"   ;
    }
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute("ProductForm") Product product){
        productService.creatProduct(product);
        return "redirect:/all";
    }
@RequestMapping("/all")
    public String listeproducts(Model model){
    List<Product> listProducts =  productService.getAllProduct();
    model.addAttribute("listProducts", listProducts);
    return "liste_products";
     }

@GetMapping("delete/{id}")
    public String deleteProduct(@PathVariable("id")Integer id){
        productService.deleteproduct((id));
        return "redirect:/all";
    }
    @RequestMapping("/allProduct")
    public String listeproduct(Model model){
        List<Product> listproduct =  productService.getAllProduct();
        model.addAttribute("listProduct", listproduct);
        return "liste_product";
    }

    @GetMapping("deleteProduct/{id}")
    public String deleteproduct(@PathVariable("id")Integer id){
        productService.deleteproduct(id);
        return "redirect:/allProduct";
    }


}
