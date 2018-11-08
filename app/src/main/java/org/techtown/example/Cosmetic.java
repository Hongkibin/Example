package org.techtown.example;

public class Cosmetic {
    int category_id;
    int cosmetic_id;
    String name;

    public Cosmetic(int category_id, int cosmetic_id, String name) {
        this.category_id = category_id;
        this.cosmetic_id = cosmetic_id;
        this.name = name;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public int getCosmetic_id() {
        return cosmetic_id;
    }

    public void setCosmetic_id(int cosmetic_id) {
        this.cosmetic_id = cosmetic_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
