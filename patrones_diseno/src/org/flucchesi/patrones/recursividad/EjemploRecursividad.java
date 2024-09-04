package org.flucchesi.patrones.recursividad;

import org.flucchesi.patrones.recursividad.models.Componente;

import java.util.stream.Stream;

public class EjemploRecursividad {
    public static void main(String[] args) {
/*        Componente pc = new Componente("Gabinete PC ATX");
        Componente poder = new Componente("Fuente Poder 700w");
        Componente placaMadre = new Componente("MainBoard Asus sockets AMD");
        Componente cpu = new Componente("Cpu AMD Ryzen 5 2800");
        Componente ventilador = new Componente("Ventilador CPU");
        Componente disipador = new Componente("Disipador");
        Componente tv =  new Componente("Nvidia RTX 3080 8GB");
        Componente gpu = new Componente("Nvidia GPU RTX");
        Componente gpuRam = new Componente("4GB Ram");
        Componente gpuRam2 = new Componente("4GB Ram");
        Componente gpuVentiladores = new Componente("Ventiladores");
        Componente ram = new Componente("Memoria Ram 32GB");
        Componente ssd = new Componente("Disco SSD 2T");*/

        Componente house = new Componente("house");
        Componente kitchen = new Componente("kitchen");
        Componente living = new Componente("living");
        Componente bedroom = new Componente("bedroom");
        Componente bathroom = new Componente("bathroom");
        Componente electrodomesticos_comer = new Componente("horno");
        Componente sala  = new Componente("sala principal");
        Componente habitacion =  new Componente("habitacion principal con baño en suite");
        Componente electrodomesticos_lavar = new Componente("lavavajillas");
        Componente electrodomesticos_entretenimiento = new Componente("televisor");
        Componente electrodomesticos_confort = new Componente("Estufa");
        Componente cama = new Componente("cama");
        Componente lavamanos = new Componente("lavatorio");
        Componente inodoro = new Componente("inodoro y videth");
        Componente armario =  new Componente("armario");
        Componente Ducha = new Componente("Ducha");
        Componente Lámpara_de_noche = new Componente("Lámpara de noche");
        Componente Refrigerador = new Componente("Refrigerador");
        Componente Sofá = new Componente("Sofá");
        Componente electrodomesticos_trabajo = new Componente("pc");
        Componente videth = new Componente("videth");

        kitchen.addComponente(electrodomesticos_comer)
                .addComponente(electrodomesticos_lavar)
                .addComponente(Refrigerador);
        living.addComponente(electrodomesticos_entretenimiento)
                .addComponente(Sofá)
                .addComponente(electrodomesticos_confort)
                .addComponente(electrodomesticos_trabajo)
                .addComponente(armario)
                .addComponente(sala);
        bedroom.addComponente(cama)
                .addComponente(Lámpara_de_noche)
                .addComponente(habitacion);
        bathroom.addComponente(lavamanos)
                .addComponente(inodoro)
                .addComponente(videth)
                .addComponente(Ducha);
        house.addComponente(bathroom).addComponente(living).addComponente(living).addComponente(kitchen);




        /*        cpu.addComponente(ventilador)
                .addComponente(disipador);
        tv.addComponente(gpu)
                .addComponente(gpuRam)
                .addComponente(gpuRam2)
                .addComponente(gpuVentiladores);
        placaMadre.addComponente(cpu)
                .addComponente(tv)
                .addComponente(ram)
                .addComponente(ssd);
        pc.addComponente(poder)
                .addComponente(placaMadre)
                .addComponente(new Componente("Teclado"))
                .addComponente(new Componente("Mouse"));*/

        metodoRecursivoJava8(house, 0).forEach(c -> System.out.println("\t".repeat(c.getNivel()) + c.getNombre()));

    }

    public static Stream<Componente> metodoRecursivoJava8(Componente c, int nivel){
        c.setNivel(nivel);
        return Stream.concat(Stream.of(c),
                c.getHijos().stream().flatMap(hijo -> metodoRecursivoJava8(hijo, nivel + 1)));

    }

    public static void metodoRecursivo(Componente c, int nivel){
        System.out.println("\t".repeat(nivel) + c.getNombre());
        if(c.tieneHijos()){
            for(Componente hijo: c.getHijos()){
                metodoRecursivo(hijo, nivel + 1);
            }
        }
    }
}
