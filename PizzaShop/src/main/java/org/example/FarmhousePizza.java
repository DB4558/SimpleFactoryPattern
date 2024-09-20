package org.example;

public class FarmhousePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing  Farmhouse pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Farmhouse Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Farmhouse Pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing Farmhouse Pizza");
    }
}
