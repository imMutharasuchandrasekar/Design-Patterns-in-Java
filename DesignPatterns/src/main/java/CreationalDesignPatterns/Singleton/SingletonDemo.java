package CreationalDesignPatterns.Singleton;

public class SingletonDemo {
    public static void main(String[]args)
    {
        System.out.println( DbConnection.getInstance() );
    }
}
