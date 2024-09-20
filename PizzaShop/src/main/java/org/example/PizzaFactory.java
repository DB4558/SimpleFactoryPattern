package org.example;

public class PizzaFactory {
    Pizza pizza=null;
    public Pizza createPizza(String type){
        if(type.equals("Cheese"))
            pizza=new CheesePizza();
        else if(type.equals("Pepperoni"))
            pizza=new PepperoniPizza();
        else if(type.equals("Farmhouse"))
            pizza=new FarmhousePizza();
        else
            pizza=null;
        return pizza;
    }
}
