package StructuralDesignPatterns.Decorator;

public class Notifier implements INotifier {

    private String username;

    public Notifier( String user ) {
        username = user;
    }

    @Override
    public String getUserName() {
        return username;
    }

    @Override
    public void send( String msg ) {
        // mailing logics
        System.out.println( "Mail notifi. was send to " + username );
    }
}
