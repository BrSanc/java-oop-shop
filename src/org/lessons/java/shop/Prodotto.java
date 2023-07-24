package org.lessons.java.shop;


import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Random;


public class Prodotto {
    private int code;
    private String name;
    private String description;
    private double price;
    private int iva;

    private HashSet<Category> categories;

    //---------------------COSTRUTTORI-------------
    Random random = new Random();
    DecimalFormat d = new DecimalFormat("#.##");


    public Prodotto(String name, String description, double price, int iva) {
        this.code = generatedCode();
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

    public int getIva() {
        return iva;
    }

    public double basePrice() {
        return price;
    }

    public HashSet<Category> getCategories() {
        return categories;
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

    public void setIva(int iva) {
        this.iva = iva;
    }

    public void setCategories(HashSet<Category> categories) {
        this.categories = categories;
    }

    //--------------------------Metodi----------------------------------------

    //Il prodotto esponga sia un metodo per avere il prezzo base che uno per avere il prezzo comprensivo di iva
    //Il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome:
    // il codice deve avere un pad left di zeri per arrivare a 8 caratteri
    // (ad esempio codice 91 diventa 00000091, mentre codice 123445567 resta come è)


    private int generatedCode(){
        int generatedCode = random.nextInt(1, 100000000);
        return generatedCode;
    }

    public double pricePlusIVA(){
        double ivaPrice = (price / 100) * iva;
        double pricePsIVA = ivaPrice + price;

        return pricePsIVA;
    }

    public String nameCode(){
        String codeString = String.valueOf(code);
        return String.format("%08d", Integer.parseInt(codeString))+"-"+name;
    }

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
