package CreationalDesignPatterns.Prototype;

public class Circle extends Shape {

     int radius;

     public Circle(){
     }

    public Circle( Circle source ) {
        // A parent constructor call is needed to copy private
        // fields defined in the parent class.
        super( source );
        this.radius = source.radius * 2;
    }

    @Override
    Shape Clone() {
        return new Circle(this);
    }
}
