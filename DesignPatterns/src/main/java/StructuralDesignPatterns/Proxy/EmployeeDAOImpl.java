package StructuralDesignPatterns.Proxy;

public class EmployeeDAOImpl implements EmployeeDAO
{
    @Override
    public void create() {
        // User creatioin logics
        System.out.println("User has been created successfully !");
    }
}
