package org.flucchesi.patrones.lambda.lambda;

import org.flucchesi.patrones.lambda.lambda.models.Usuario;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EjemploConsumer {
    public static void main(String[] args) {

        Consumer<Date> consumidorFecha = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("yy-MM-dd");
            System.out.println(f.format(fecha));
        };
        consumidorFecha.accept(new Date());

        Consumer<Date> consumidor = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(fecha));
        };
        consumidor.accept(new Date());

        BiConsumer<String, Integer> consumerBi = (nombre, edad) -> {
            System.out.println(nombre + ", tiene" + edad + " años!");
        };
        consumerBi.accept("Fer", 38);

        BiConsumer<String, Integer> consumidorBi = (nombre, edad) -> System.out.println(nombre + ", tiene " + edad + " años!");
        consumidorBi.accept("pepe", 20);

        Consumer<String> consumidorSout = System.out::println;
        consumidorSout.accept("PRUEBA FER");

        Consumer<String> consumidor2 = System.out::println;
        consumidor2.accept("Hola mundo lambda");

        List<String> nombres = Arrays.asList("andres", "pepe", "luz", "paco");
        nombres.forEach(consumidor2);

        Supplier<Usuario> creaUsuario = Usuario::new;
        Usuario usuario = creaUsuario.get();

        BiConsumer<Usuario, String> asignarNombre = Usuario::setNombre;
        asignarNombre.accept(usuario, "Andrés");
        System.out.println("Nombre usuario: " + usuario.getNombre());

        Supplier<String> proveedor = () -> "Hola mundo lambda supplier";

        System.out.println(proveedor.get());
    }
}
