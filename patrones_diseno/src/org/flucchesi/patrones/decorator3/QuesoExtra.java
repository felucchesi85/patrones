package org.flucchesi.patrones.decorator3;

public class QuesoExtra implements Pizza{
    private Pizza pizza;

    public QuesoExtra(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String descripcion() {
        return pizza.descripcion()+", queso extra";
    }

    @Override
    public double costo() {
        return pizza.costo() + 2.0;
    }
}
