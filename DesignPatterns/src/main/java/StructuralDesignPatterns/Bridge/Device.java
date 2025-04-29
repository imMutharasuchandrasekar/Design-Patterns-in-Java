package StructuralDesignPatterns.Bridge;

public interface Device {

    String getName();

    void togglePower();

    void increaseVol();

    void decreaseVol();

    String getDeviceStatus();
}
