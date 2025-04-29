package StructuralDesignPatterns.Decorator;

public class Main {

    public static void main(String[]args) {

        // Object of FacebookDecorator is being stored as an INotifier.
        // This is the reason we need an common Interface in Decorator pattern.
        INotifier obj = new FacebookDecorator( new Notifier("Muthu") );

        /*
        Object creation flow:
        step 1 - Notifier object will be created and passed to WhatsAppDecorator as INotifier type.
        step 2 - WhatsAppDecorator object will be created with the passed [Notifier obj] as wrapee and passed to FacebookDecorator as INotifier type.
        step 3 - FacebookDecorator object will be created with the passed [WhatsAppDecorator] as wrapee and reference as INotifier type.
         */
        INotifier obj2 = new FacebookDecorator( new WhatsAppDecorator( new Notifier("Muthu") ) );


        obj.send( "order placed" );
        System.out.println("----------------------------");

        /*
        Code Execution
        step 1 - FacebookDecorator.send() is called which calls super.send() ie) WhatsAppDecorator.send
        step 2 - WhatsAppDecorator.send() in also calls the super.send() ie) Notifier.send
         */
        obj2.send( "order delivered" );
    }
}
