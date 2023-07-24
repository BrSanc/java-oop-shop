package org.lessons.java.shop;

import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Prodotto prodotto = new Prodotto("Robot", "qualcosa di nuovo", 99.99, 22);
        DecimalFormat d = new DecimalFormat("#.##");

        HashSet<Category> categories = new HashSet<>();
        categories.add(new Category("offer", "Product in special offer"));
        categories.add(new Category("edible", "Edible product"));
        prodotto.setCategories(categories);
        Scanner scan = new Scanner(System.in);





        System.out.println(prodotto.basePrice() + "€");

        System.out.println(prodotto.getIva() + "%");
        System.out.println(d.format(prodotto.pricePlusIVA())+"€");


        System.out.println(prodotto.nameCode());

        System.out.println(prodotto.toString());

        for (Category c: prodotto.getCategories()) {
            System.out.println(c.getName()+": "+c.getDescription());
        }









    }
}
