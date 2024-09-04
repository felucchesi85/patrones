package org.flucchesi.patrones.decorator2.decorador;

import org.flucchesi.patrones.decorator2.Configurable;

public class ConFrapuccino extends CafeDecorador {
    public ConFrapuccino(Configurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecioBase() {
        return cafe.getPrecioBase() + 10f;
    }

    @Override
    public String getIngredientes() {
        return cafe.getIngredientes()+ "Hielo Licuado Frape";
    }
}
