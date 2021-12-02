package ru.gb.basket;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class ProductRepository {
    private List<Product> productList;

    @PostConstruct
    public void init(){
        productList = List.of(
                new Product(1,"Сайра",159.0f),
                new Product(2,"яблоко 1кг",129.0f),
                new Product(3,"йогурт",39.0f),
                new Product(4,"Кефир",89.0f),
                new Product(5,"апельсин 1кг",99.0f)
        );
    }


}
