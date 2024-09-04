package org.flucchesi.patrones.composite2.ejemplo;

import org.flucchesi.patrones.composite2.Componente;
import org.flucchesi.patrones.composite2.NodoSimple;
import org.flucchesi.patrones.composite2.NodoCompuesto;

public class EjemploComposite {
    public static void main(String[] args) {

        // Crear nodo compuesto (familia)
        Componente familia1 = new NodoCompuesto("Familia González");
        Componente familia2 = new NodoCompuesto("Familia Lucchesi");
        Componente familia3= new NodoCompuesto("Familia Arienti");

        ((NodoCompuesto) familia1).agregarHijo(new NodoSimple("Juan Gonzales"));
        ((NodoCompuesto) familia1).agregarHijo(new NodoSimple("María Gonzales"));
        ((NodoCompuesto) familia2).agregarHijo(new NodoSimple("Fernando Lucchesi"));
        ((NodoCompuesto) familia2).agregarHijo(new NodoSimple("Francisco Lucchesi"));
        ((NodoCompuesto) familia3).agregarHijo(new NodoSimple("Exequiel Arienti"));
        ((NodoCompuesto) familia3).agregarHijo(new NodoSimple("Mateo Arienti"));

        ((NodoCompuesto) familia1).agregarHijo(familia2);

        Componente nodoPrincipal = new NodoCompuesto("Árbol Genealógico");
        ((NodoCompuesto) nodoPrincipal).agregarHijo(familia1);
        ((NodoCompuesto) nodoPrincipal).agregarHijo(familia3);

        // Mostrar información

        // Mostrar información
       System.out.println(nodoPrincipal.mostrar(0));
    }
}
