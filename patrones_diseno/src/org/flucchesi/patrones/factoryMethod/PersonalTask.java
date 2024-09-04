package org.flucchesi.patrones.factoryMethod;

public class PersonalTask implements Task{
    @Override
    public void execute() {
        System.out.println("Realizando tarea personal...");
    }
}
