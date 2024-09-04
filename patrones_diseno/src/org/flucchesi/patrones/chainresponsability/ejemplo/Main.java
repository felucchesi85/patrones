package org.flucchesi.patrones.chainresponsability.ejemplo;

import org.flucchesi.patrones.chainresponsability.Compra;
import org.flucchesi.patrones.chainresponsability.SistemaAprobacion;

public class Main {
    public static void main(String[] args) {
        SistemaAprobacion sistema = new SistemaAprobacion();
        Compra compra1 = new Compra(80);
        Compra compra2 = new Compra(500);
        Compra compra3 = new Compra(1500);

        System.out.println("Procesando compra 1...");
        sistema.procesarCompra(compra1);
        System.out.println();

        System.out.println("Procesando compra 2...");
        sistema.procesarCompra(compra2);
        System.out.println();

        System.out.println("Procesando compra 3...");
        sistema.procesarCompra(compra3);
        System.out.println();


        }
}
