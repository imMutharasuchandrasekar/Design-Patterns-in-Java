package StructuralDesignPatterns.Decorator;

public abstract class BaseNotificationDecorator implements INotifier {

    // Core notifier object
    private INotifier wrapee;

    public BaseNotificationDecorator( INotifier wrapee ) {
        this.wrapee = wrapee;
    }

    @Override
    public String getUserName() {
        return wrapee.getUserName();
    }

    @Override
    public void send( String msg ) {
        wrapee.send( msg );
    }
}


