package org.lessons.java.shop;

public class Category {
    private String name;
    private String description;

//-------------------Costructor-------------------

    public Category(String name, String description) {
        this.name = name;
        this.description = description;
    }
//--------------Getter e setter------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
