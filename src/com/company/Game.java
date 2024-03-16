package com.company;

public class Game extends Product {
    String Genre;
    int releaseYear;

    public Game(String tittle, double price, int inventoryCount,String Genre,int releaseYear){
        super(tittle, price, inventoryCount);
        this.Genre=Genre;
        this.releaseYear=releaseYear;
    }

    @Override
    public String GetDescription() {
        return "Game{" +
                "Genre='" + Genre + '\'' +
                ", releaseYear=" + releaseYear +
                ", tittle='" + tittle + '\'' +
                ", price=" + price +
                '}';
    }


}
