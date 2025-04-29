package CreationalDesignPatterns.Prototype;

public abstract class Shape {
     int  X;
     int  Y;
     String color;

    // A regular constructor.
    public Shape() {
        System.out.println("default shape cons. called ");
    }

    // The prototype constructor. A fresh object is initialized
    // with values from the existing object.
    public Shape(  Shape source ) {
        this.X = source.X;
        this.Y = source.Y;
        this.color = source.color;
    }

    // The clone operation returns one of the Shape subclasses.
    abstract Shape Clone();
}
