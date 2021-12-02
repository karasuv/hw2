package ru.gb.basket;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope("prototype")
public class Basket {
    private  ProductRepository productRepository;
    private List<Product> products;
}
