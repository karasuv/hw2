package ru.gb.basket;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);

        var basket1 = context.getBean(Basket.class);
        var basket2 = context.getBean(Basket.class);


        basket1.addProductById(1);
        basket1.addProductById(2);
        basket1.addProductById(60);

        basket1.addProductById(5);
        basket1.deleteProductById(5);

        basket2.addProductById(3);
        basket2.addProductById(4);
        basket2.addProductById(5);

        basket2.deleteProductById(3);
        basket2.deleteProductById(1);


        System.out.println(basket1);
        System.out.println(basket2);

        context.close();

    }


}
