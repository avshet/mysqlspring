package com.example.mysqlspring;

import com.example.mysqlspring.entity.Product;
import com.example.mysqlspring.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;


@Configuration
public class ProductConfig {

    @Bean
    CommandLineRunner commandLineRunner(ProductRepository repository){
        return args->{
            Product Mariam = new Product("comp",23);
            repository.saveAll(List.of(Mariam));
        };

    }
}
