package StructuralDesignPatterns.Bridge;

public class Main {
    public static void main(String[]args) {
        Remote remote = new Remote(new Tv());

        remote.togglePower();
    }
}
