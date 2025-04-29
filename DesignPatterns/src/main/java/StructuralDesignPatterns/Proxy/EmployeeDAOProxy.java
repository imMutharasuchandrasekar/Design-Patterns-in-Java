package StructuralDesignPatterns.Proxy;

public class EmployeeDAOProxy implements EmployeeDAO
{
    EmployeeDAOImpl employeeDAO;

    public EmployeeDAOProxy()
    {
        // some Lazy loading conditionals
        employeeDAO = new EmployeeDAOImpl();
    }

    @Override
    public void create()
    {
        // Some privilege checks
        System.out.println("Entitlements of the current user was verified by proxy obj");
        employeeDAO.create();
    }
}
