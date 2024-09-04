package org.flucchesi.patrones.chainresponsability;

public class SistemaAprobacion {
    private BaseAprobador aprobadorSupervisor;
    private BaseAprobador aprobadorGerente;
    private BaseAprobador aprobadorDirector;

    public SistemaAprobacion() {
        // Configuración de la cadena de responsabilidad
        aprobadorSupervisor = new Supervisor();
        aprobadorGerente = new Gerente();
        aprobadorDirector = new Director();

        aprobadorSupervisor.setSiguienteAprobador(aprobadorGerente);
        aprobadorGerente.setSiguienteAprobador(aprobadorDirector);
    }

    public void procesarCompra(Compra compra) {
        // Inicio de la cadena de responsabilidad
        aprobadorSupervisor.aprobarCompra(compra);
    }
}
