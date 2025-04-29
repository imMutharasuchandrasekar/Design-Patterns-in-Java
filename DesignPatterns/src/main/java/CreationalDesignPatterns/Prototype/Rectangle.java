package CreationalDesignPatterns.Prototype;

public class Rectangle extends Shape {

     int width;
     int height;

    public Rectangle( Rectangle source ) {
        // A parent constructor call is needed to copy private
        // fields defined in the parent class.
        super(source);
        this.width = source.width;
        this.height = source.height;
    }

    @Override
    Shape Clone() {
        return new Rectangle(this);
    }
}
