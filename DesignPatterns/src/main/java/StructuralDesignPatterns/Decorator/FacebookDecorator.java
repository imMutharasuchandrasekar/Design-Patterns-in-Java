package StructuralDesignPatterns.Decorator;

public class FacebookDecorator extends  BaseNotificationDecorator {

    public FacebookDecorator( INotifier wrapee ) {
        super( wrapee );
    }

    @Override
    public void send( String msg ) {
        super.send( msg );
        // Facebook notiif. logics
        System.out.println( "FB notifi. was send to " + super.getUserName() );
    }
}
