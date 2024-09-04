package org.flucchesi.patrones.factoryMethod;

public class PersonalTaskCreator extends TaskCreator{
    @Override
    public Task createTask() {
        return new PersonalTask();
    }
}
