package org.example;

public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
            System.out.println("Preparing  Cheese pizza");
    }

    @Override
    public void bake() {
          System.out.println("Baking Cheese Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Cheese Pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing Cheese Pizza");
    }
}
