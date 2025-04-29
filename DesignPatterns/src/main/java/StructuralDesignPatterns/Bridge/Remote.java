package StructuralDesignPatterns.Bridge;

public class Remote {
    protected Device device;

    public Remote( Device instance ) {
        device = instance;
    }

    public void togglePower() {
        device.togglePower();
        System.out.println( device.getName() + " is turned " + device.getDeviceStatus() );
    }

    public void increaseVol() {
        device.increaseVol();
    }

    public void decreaseVol() {
        device.decreaseVol();
    }
}
