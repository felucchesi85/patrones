package org.flucchesi.patrones.factoryMethod;

public class EjemploSingleton {
    public static void main(String[] args) {
        TaskCreator workTaskCreator = new WorkTaskCreator();
        TaskCreator personalTaskCreator = new PersonalTaskCreator();

        Task workTask = workTaskCreator.createTask();
        Task personalTask = personalTaskCreator.createTask();

        workTask.execute(); // Salida: Realizando tarea de trabajo...
        personalTask.execute(); // Salida: Realizando tarea personal...
    }
}
