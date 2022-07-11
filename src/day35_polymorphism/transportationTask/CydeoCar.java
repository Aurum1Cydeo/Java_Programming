package day35_polymorphism.transportationTask;

import day34_abstractcion.animal_Task.Flyable;
import day34_abstractcion.animal_Task.SwimAble;

public class CydeoCar extends Car implements Flyable,Electric,AutoPilot, SwimAble {

    public CydeoCar(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void autoPark() {

    }

    @Override
    public void selfDrive() {

    }

    @Override
    public void charge() {

    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }
}