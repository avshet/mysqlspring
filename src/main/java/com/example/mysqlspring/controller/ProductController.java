package com.example.mysqlspring.controller;

import com.example.mysqlspring.entity.Product;
import com.example.mysqlspring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "prod")
public class ProductController {
    private final ProductService serv;
    @Autowired
    public ProductController(ProductService serv){
        this.serv = serv;
    }

    @GetMapping(path = "/get")
    public List<Product> getProds(){
        List<Product> values = serv.get();
        System.out.println(values);
        return values;

    }

//    @PostMapping("/add")
//    void addProds(@RequestBody Product prod){
//         serv.add(prod);
//    }
}
