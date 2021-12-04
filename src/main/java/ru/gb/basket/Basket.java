package ru.gb.basket;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class Basket {
    private  ProductRepository productRepository;
    private List<Product> products;

    public Basket(ProductRepository productRepository) {
        products = new ArrayList<>();
        this.productRepository = productRepository;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "productRepository=" + productRepository +
                ", products=" + products +
                '}';
    }

    public void addProductById(Integer id) {
        productRepository.findProductById(id).ifPresent(product -> products.add(product));
    }

    public void deleteProductById(Integer id){
        products.stream().filter(product -> product.getId().equals(id)).findFirst().ifPresent(product -> products.remove(product)   );
    }




}
