package StructuralDesignPatterns.Bridge;

public class Tv implements Device {

    private static boolean _isOn;
    private int _vol;

    @Override
    public String getName() {
        return "Tv";
    }

    @Override
    public void togglePower() {
        _isOn = !_isOn;
    }

    @Override
    public void increaseVol() {
        _vol++;
    }

    @Override
    public void decreaseVol() {
        _vol--;
    }

    @Override
    public String getDeviceStatus() {
        if( _isOn )
            return "ON";
        return "OFF";
    }
}
