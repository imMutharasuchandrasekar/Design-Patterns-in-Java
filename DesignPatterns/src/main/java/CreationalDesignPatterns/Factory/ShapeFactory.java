package CreationalDesignPatterns.Factory;

public class ShapeFactory {

    public Shape getObj( String instanceType )
    {
        if( instanceType.equals("circle") ){
            return new Circle();
        }
        else if( instanceType.equals("rectangle")){
            return new Rectangle();
        }
        return null;
    }
}
