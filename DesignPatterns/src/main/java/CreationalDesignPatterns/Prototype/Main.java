package CreationalDesignPatterns.Prototype;

public class Main {
  public static void main( String[]args )
  {
      Circle circle = new Circle();
      circle.X = 10;
      circle.Y = 10;
      circle.radius = 20;

      Circle anotherCircle =(Circle) circle.Clone();
      System.out.println( anotherCircle.X +  "\n"  + anotherCircle.radius + "\n" + anotherCircle.color );
  }

}
