package org.flucchesi.patrones.chainresponsability;

public class Supervisor extends BaseAprobador{
    public void aprobarCompra(Compra compra) {
        if (compra.getMonto() <= 100) {
            System.out.println("Compra aprobada por el Supervisor");
            super.aprobarCompra(compra);
        } else {
            getSiguienteAprobador().aprobarCompra(compra);
        }
    }
}
