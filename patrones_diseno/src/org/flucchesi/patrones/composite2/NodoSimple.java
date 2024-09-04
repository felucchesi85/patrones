package org.flucchesi.patrones.composite2;

public class NodoSimple extends Componente {

    private int edad;
    public NodoSimple(String nombre) {
        super(nombre);
    }

    @Override
    public String mostrar(int nivel) {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);return "\t".repeat(nivel) + nombre;
    }

    @Override
    public boolean buscar(String nombre) {
        return this.nombre.equalsIgnoreCase(nombre);
    }
}
