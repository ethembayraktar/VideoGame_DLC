package com.company;

public class Main {

    public static void main(String[] args) {

        Game game1 = new Game("GTA V", 49.99, 100, "Action", 2013);
        Game game2 = new Game("The Witcher 3: Wild Hunt", 39.99, 75, "RPG", 2015);
        DLC dlc1 = new DLC("GTA V: The Cayo Perico Heist", 9.99, 50, game1);
        DLC dlc2 = new DLC("The Witcher 3: Blood and Wine", 19.99, 25, game2);


        Customer customer1 = new Customer("John Doe");

        customer1.addToCart(game1);
        customer1.addToCart(game2);
        customer1.addToCart(dlc1);
        customer1.addToCart(dlc2);


        customer1.listCart();
    }
}
