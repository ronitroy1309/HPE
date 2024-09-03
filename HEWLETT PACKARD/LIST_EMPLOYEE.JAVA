import java.util.ArrayList;
import java.util.List;

public class Employees {
    private List<Employee> employeeList = new ArrayList<>();

    // Getter for the employee list
    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    // Setter for the employee list
    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
