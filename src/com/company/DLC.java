package com.company;

public class DLC extends Product{

    Game game;

    public DLC(String tittle, double price, int inventoryCount,Game game){
        super(tittle, price, inventoryCount);
        this.game=game;

    }





    @Override
    public String GetDescription() {
        return "DLC{" +
                "game=" + game +
                ", tittle='" + tittle + '\'' +
                ", price=" + price +
                '}';
    }
}
