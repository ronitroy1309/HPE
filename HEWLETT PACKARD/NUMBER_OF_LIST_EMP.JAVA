public class EmployeeManager {
    private Employees employees;

    public EmployeeManager() {
        employees = new Employees();
        employees.setEmployeeList(List.of(
            new Employee(1L, "John", "Doe", "john.doe@example.com", "Developer"),
            new Employee(2L, "Jane", "Smith", "jane.smith@example.com", "Manager"),
            new Employee(3L, "Mike", "Brown", "mike.brown@example.com", "Analyst")
        ));
    }

    public Employees getEmployees() {
        return employees;
    }
}
