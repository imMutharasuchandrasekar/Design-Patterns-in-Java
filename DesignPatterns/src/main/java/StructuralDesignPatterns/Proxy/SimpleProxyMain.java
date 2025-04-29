package StructuralDesignPatterns.Proxy;

public class SimpleProxyMain {
    public static void main(String[]args) {
        EmployeeDAOProxy obj = new EmployeeDAOProxy();
        obj.create();
    }
}
