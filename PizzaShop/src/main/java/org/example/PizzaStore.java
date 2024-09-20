package org.example;

public class PizzaStore {
    PizzaFactory pizzaFactory;
    public PizzaStore(PizzaFactory factory){
        this.pizzaFactory=factory;
    }

    public void orderPizza(String type){
        Pizza pizza;
        pizza=pizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
