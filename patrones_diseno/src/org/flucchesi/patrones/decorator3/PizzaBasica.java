package org.flucchesi.patrones.decorator3;

public class PizzaBasica implements Pizza{
    @Override
    public String descripcion() {
        return "Pizza basica";
    }

    @Override
    public double costo() {
        return 10.0;
    }
}
