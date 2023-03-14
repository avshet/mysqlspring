package com.example.mysqlspring.service;
import java.util.List;
import com.example.mysqlspring.entity.Product;
import com.example.mysqlspring.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class ProductService {
    private final ProductRepository rep;

    @Autowired
    public ProductService(ProductRepository rep) {
        this.rep = rep;
    }



    public void add(Product prod){
        rep.save(prod);
    }
    public List<Product> get(){
        return rep.findAll();
    }
}
