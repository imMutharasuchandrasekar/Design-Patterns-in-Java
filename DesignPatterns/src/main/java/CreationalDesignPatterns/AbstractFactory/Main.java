package CreationalDesignPatterns.AbstractFactory;

import DesignPatterns.CreationalDesignPatterns.AbstractFactory.models.Car;

public class Main {
    public static void main(String[]args){
        AbstractFactoryProducer producer = new AbstractFactoryProducer();
        AbstractFactory factoryObj = producer.getFactoryInstance("luxury");
        Car carObj = factoryObj.getInstance( 2500000 );
        System.out.println( carObj.getModel() );
    }
}
