package CreationalDesignPatterns.AbstractFactory;

public class AbstractFactoryProducer {

    public AbstractFactory getFactoryInstance( String instanceType ){
        if( instanceType.equalsIgnoreCase("economic") )
        {
            return new EconomicCarFactory();
        }
        else if ( instanceType.equalsIgnoreCase("luxury") ){
            return new LuxuryCarFactory();
        }
        return null;
    }
}
