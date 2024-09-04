package org.flucchesi.patrones.decorator.decorador;

import org.flucchesi.patrones.decorator.Formateable;

public class RemplazarEspaciosDecorador extends TextoDecorador{
    private MayusculaDecorador mayusculaDecorador;
    public RemplazarEspaciosDecorador(Formateable texto) {

        super(texto);
        this.mayusculaDecorador = new MayusculaDecorador(texto);
    }
    @Override
    public String darFormato() {
        return texto.darFormato().replace(" ", "_");
    }
}
