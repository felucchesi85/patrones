package org.flucchesi.patrones.factoryMethod;

public class WorkTask implements Task{
    @Override
    public void execute() {
        System.out.println("Realizando tarea de trabajo...");
    }
}
