package org.flucchesi.patrones.chainresponsability;

public class Director extends BaseAprobador{
    public void aprobarCompra(Compra compra) {
        // Lógica de aprobación para el director (no hay límite de monto)
        System.out.println("Compra aprobada por el Director");
        super.aprobarCompra(compra);
    }
}
