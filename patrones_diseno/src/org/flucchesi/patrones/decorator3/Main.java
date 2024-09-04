package org.flucchesi.patrones.decorator3;

public class Main {
    public static void main(String[] args) {
        // Creamos una pizza básica
        Pizza pizzaBasica = new PizzaBasica();

        // Decoramos la pizza básica con queso extra
        Pizza pizzaConQuesoExtra = new QuesoExtra(pizzaBasica);

        // Mostramos la descripción y el costo de la pizza con queso extra
        System.out.println(pizzaConQuesoExtra.descripcion());
        System.out.println("Costo: $" + pizzaConQuesoExtra.costo());
        System.out.println(pizzaBasica.descripcion());
        System.out.println("Costo: $" + pizzaBasica.costo());
    }
}
