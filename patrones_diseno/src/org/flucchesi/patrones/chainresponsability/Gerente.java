package org.flucchesi.patrones.chainresponsability;

public class Gerente extends BaseAprobador{
    public void aprobarCompra(Compra compra) {
        if (compra.getMonto() <= 1000) {
            System.out.println("Compra aprobada por el Gerente");
            super.aprobarCompra(compra);
        } else {
            getSiguienteAprobador().aprobarCompra(compra);
        }
    }
}
