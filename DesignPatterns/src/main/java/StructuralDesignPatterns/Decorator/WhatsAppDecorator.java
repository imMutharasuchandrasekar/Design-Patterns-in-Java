package StructuralDesignPatterns.Decorator;

public class WhatsAppDecorator extends BaseNotificationDecorator {

    public WhatsAppDecorator( INotifier wrapee ) {
        super( wrapee );
    }

    @Override
    public void send( String msg ) {
        super.send( msg );
        // Whatsapp notiif. logics
        System.out.println( "WhatsApp notifi. was send to " + super.getUserName() );
    }
}
