package org.flucchesi.patrones.factoryMethod;

public class WorkTaskCreator extends TaskCreator{
    @Override
    public Task createTask() {
        return new WorkTask();
    }
}
