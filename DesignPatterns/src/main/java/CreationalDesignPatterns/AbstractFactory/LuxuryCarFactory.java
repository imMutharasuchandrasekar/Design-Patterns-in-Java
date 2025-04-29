package CreationalDesignPatterns.AbstractFactory;

import DesignPatterns.CreationalDesignPatterns.AbstractFactory.models.Car;
import DesignPatterns.CreationalDesignPatterns.AbstractFactory.models.LuxuryCar1;
import DesignPatterns.CreationalDesignPatterns.AbstractFactory.models.LuxuryCar2;

public class LuxuryCarFactory implements AbstractFactory {
    @Override
    public Car getInstance(double price ) {
        if( price >= 3000000 ){
            return new LuxuryCar1();
        }
        else if( price >= 2000000 && price < 3000000 ){
            return new LuxuryCar2();
        }
        return null;
    }
}
