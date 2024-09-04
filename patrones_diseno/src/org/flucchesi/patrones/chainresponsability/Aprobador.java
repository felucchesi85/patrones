package org.flucchesi.patrones.chainresponsability;

public interface Aprobador {
    void aprobarCompra(Compra compra);
    void rechazarCompra(Compra compra);
}
