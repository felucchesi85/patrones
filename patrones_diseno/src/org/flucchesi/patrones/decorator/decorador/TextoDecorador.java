package org.flucchesi.patrones.decorator.decorador;

import org.flucchesi.patrones.decorator.Formateable;

abstract public class TextoDecorador implements Formateable {
    protected Formateable texto;

    public TextoDecorador(Formateable texto) {
        this.texto = texto;
    }
}
