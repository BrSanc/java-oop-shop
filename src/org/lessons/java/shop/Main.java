package org.lessons.java.shop;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Prodotto prodotto = new Prodotto("Robot", "qualcosa di nuovo", 23123.99, 22);
        DecimalFormat d = new DecimalFormat("#.##");



        System.out.println(prodotto.basePrice() + "€");

        System.out.println(prodotto.getIva() + "%");
        System.out.println(d.format(prodotto.pricePlusIVA())+"€");

        System.out.println(prodotto.nameCode());

        System.out.println(prodotto.toString());









    }
}
