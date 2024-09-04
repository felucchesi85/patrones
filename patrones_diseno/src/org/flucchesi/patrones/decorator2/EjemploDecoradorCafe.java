package org.flucchesi.patrones.decorator2;

import org.flucchesi.patrones.decorator2.decorador.ConChocolateDecorador;
import org.flucchesi.patrones.decorator2.decorador.ConCremaDecorador;
import org.flucchesi.patrones.decorator2.decorador.ConFrapuccino;
import org.flucchesi.patrones.decorator2.decorador.ConLecheDecorador;

public class EjemploDecoradorCafe {
    public static void main(String[] args) {
        Configurable cafe = new Cafe("Cafe Mocha", 7);
        ConCremaDecorador conCrema = new ConCremaDecorador(cafe);
        ConLecheDecorador conLeche = new ConLecheDecorador(conCrema);
        ConChocolateDecorador conChoco = new ConChocolateDecorador(conLeche);

        System.out.println("El precio del cafe moca es: " + conChoco.getPrecioBase());
        System.out.println("Los ingredientes: " + conChoco.getIngredientes());

        Configurable capuchino = new Cafe("Cafe Capuchino", 4);
        conCrema = new ConCremaDecorador(capuchino);
        conLeche = new ConLecheDecorador(conCrema);
        System.out.println("El precio del capuchino es: " + conLeche.getPrecioBase());
        System.out.println("Los Ingredientes " + conLeche.getIngredientes());

        Configurable espresso = new Cafe("Cafe Espresso", 3);
        System.out.println("El precio del cafe Espresso es " + espresso.getPrecioBase());
        System.out.println("Los ingredientes del cafe Espresso es: " + espresso.getIngredientes());
        Configurable cafeConLeche = new Cafe("Cafe con Leche", 5);
        conLeche = new ConLecheDecorador(cafeConLeche);
        System.out.println("El precio del cafe con leche es "+ conLeche.getPrecioBase());
        System.out.println("Los ingredientes del cafe con lech son "+ conLeche.getIngredientes());

        Configurable frapuccino = new Cafe("Cafe Frapuccino", 10);
        ConFrapuccino conFrape = new ConFrapuccino(frapuccino);
        conCrema = new ConCremaDecorador(conFrape);
        conLeche = new ConLecheDecorador(conCrema);
        System.out.println("El precio del frapuccino es :"+ conLeche.getPrecioBase());
        System.out.println("Los ingredientes son "+ conLeche.getIngredientes());


    }
}
