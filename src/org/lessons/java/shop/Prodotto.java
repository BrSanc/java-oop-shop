package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    private int code;
    private String name;
    private String description;
    private double price;
    private double iva;

    //---------------------COSTRUTTORI-------------
    Random random = new Random();

    public Prodotto(String name, String description, double price, double iva) {
        this.code = random.nextInt(9, 1000);
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
    }


    //--------------------Getter----------------------------------


    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public double getIva() {
        return iva;
    }

    //-----------------Setter---------------------

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    //--------------------------Metodi----------------------------------------


    @Override
    public String toString() {
        return "Prodotto{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", iva=" + iva +
                '}';
    }
}
