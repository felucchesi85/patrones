package org.flucchesi.patrones.composite2;

import java.util.ArrayList;
import java.util.List;

public class NodoCompuesto extends Componente {

    private List<Componente> hijos = new ArrayList<>();

    public NodoCompuesto(String nombre) {
        super(nombre);
    }

    public NodoCompuesto agregarHijo(Componente hijo){
        hijos.add(hijo);
        return this;
    }

    public void removeComponente(Componente c){
        hijos.remove(c);
    }

    @Override
    public String mostrar(int nivel) {

        StringBuilder sb = new StringBuilder("\t".repeat(nivel));
        sb.append(nombre)
                .append("/")
                .append("\n");
        System.out.println("Nombre de la familia: " + nombre);
        System.out.println("Miembros de la familia:");
        for(Componente hijo: hijos){
            sb.append(hijo.mostrar(nivel+1));
            sb.append("\n");

        }
        return sb.toString();
    }

    @Override
    public boolean buscar(String nombre) {
        if(this.nombre.equalsIgnoreCase(nombre)){
            return true;
        }
        return hijos.stream().anyMatch(h -> h.buscar(nombre));
    }
}
