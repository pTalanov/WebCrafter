package ru.webcrafter.core.entities;
// Generated 24.05.2012 21:24:36 by Hibernate Tools 3.2.2.GA


import java.util.ArrayList;
import java.util.List;

/**
 * Recipe generated by hbm2java
 */
public class Recipe implements java.io.Serializable {


    private String id;
    private List<ItemTemplate> ingredients = new ArrayList<ItemTemplate>(0);
    private ItemTemplate result;

    public Recipe() {
    }


    public Recipe(String id) {
        this.id = id;
    }

    public Recipe(String id, List<ItemTemplate> ingredients, ItemTemplate result) {
        this.id = id;
        this.ingredients = ingredients;
        this.result = result;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<ItemTemplate> getIngredients() {
        return this.ingredients;
    }

    public void setIngredients(List<ItemTemplate> ingredients) {
        this.ingredients = ingredients;
    }

    public ItemTemplate getResult() {
        return this.result;
    }

    public void setResult(ItemTemplate result) {
        this.result = result;
    }


}


