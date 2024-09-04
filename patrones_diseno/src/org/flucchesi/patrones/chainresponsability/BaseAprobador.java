package org.flucchesi.patrones.chainresponsability;

abstract class BaseAprobador implements Aprobador {

    private BaseAprobador siguienteAprobador;

    public void aprobarCompra(Compra compra) {
        // Lógica de aprobación...
    }

    public void rechazarCompra(Compra compra) {
        // Lógica de rechazo...
    }

    public void setSiguienteAprobador(BaseAprobador siguienteAprobador) {
        this.siguienteAprobador = siguienteAprobador;
    }

    public BaseAprobador getSiguienteAprobador() {
        return siguienteAprobador;
    }
}
