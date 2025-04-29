package CreationalDesignPatterns.AbstractFactory;

import DesignPatterns.CreationalDesignPatterns.AbstractFactory.models.Car;
import DesignPatterns.CreationalDesignPatterns.AbstractFactory.models.EconomicCar1;
import DesignPatterns.CreationalDesignPatterns.AbstractFactory.models.EconomicCar2;

public class EconomicCarFactory implements AbstractFactory {
    @Override
    public Car getInstance(double price ) {
        if( price >= 800000 ){
            return new EconomicCar1();
        }
        else if( price >= 500000 && price < 800000 ){
            return new EconomicCar2();
        }
        return null;
    }
}
