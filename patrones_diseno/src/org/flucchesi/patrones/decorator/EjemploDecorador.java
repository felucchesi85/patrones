package org.flucchesi.patrones.decorator;

import org.flucchesi.patrones.decorator.decorador.MayusculaDecorador;
import org.flucchesi.patrones.decorator.decorador.RemplazarEspaciosDecorador;
import org.flucchesi.patrones.decorator.decorador.ReversaDecorador;
import org.flucchesi.patrones.decorator.decorador.SubrayadoDecorador;

public class EjemploDecorador {
    public static void main(String[] args) {
        Formateable texto = new Texto("Hola que tal Andrés!");

        MayusculaDecorador mayuscula = new MayusculaDecorador(texto);
        ReversaDecorador reversa = new ReversaDecorador(texto);
        SubrayadoDecorador subrayar = new SubrayadoDecorador(reversa);
        RemplazarEspaciosDecorador remplazar = new RemplazarEspaciosDecorador(subrayar);

        System.out.println(remplazar.darFormato());
    }
}
