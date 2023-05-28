package com.example.MovieService;

public class MovieModel {
    public String name;
    public String category;
   public int id;
    public MovieModel(String name, String category, int id) {
        this.name = name;
        this.category = category;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setId(int id) {
        this.id = id;
    }



}
