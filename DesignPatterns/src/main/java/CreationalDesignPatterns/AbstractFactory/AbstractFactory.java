package CreationalDesignPatterns.AbstractFactory;

import DesignPatterns.CreationalDesignPatterns.AbstractFactory.models.Car;

public interface AbstractFactory {

    public Car getInstance(double price );
}
