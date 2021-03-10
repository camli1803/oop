package com.company;

public class DigitalVideoDisc {
    private String tittle;
    private String category;
    private String director;
    private int length;
    private float cost;

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        if (cost<0) {
            return;
        }
        this.cost = cost;

    }
    public boolean equals(DigitalVideoDisc disc) {
        return this.tittle.equals(disc.tittle) && this.category.equals(disc.category) && this.director.equals(disc.director);

    }
    public DigitalVideoDisc(String tittle, String category, String director, int length, float cost) {
        this.tittle = tittle;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }
}
