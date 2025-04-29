package CreationalDesignPatterns.Factory;

public class Main {
    public static void main(String[]args)
    {
        ShapeFactory factory = new ShapeFactory();
        Shape circleObj = factory.getObj("circle");
        circleObj.compute();
    }
}
