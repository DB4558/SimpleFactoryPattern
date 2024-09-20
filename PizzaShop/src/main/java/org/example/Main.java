package org.example;

public class Main {
    public static void main(String[] args) {

        PizzaFactory pizzaFactory=new PizzaFactory();
        PizzaStore pizzaStore=new PizzaStore(pizzaFactory);
        pizzaStore.orderPizza("Cheese");
        pizzaStore.orderPizza("Farmhouse");

    }
}