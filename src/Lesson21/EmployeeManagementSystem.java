package Lesson21;

import java.util.HashMap;
import java.util.Map;

public class EmployeeManagementSystem {
    private Map<String, Employee> employees = new HashMap<>();

    public void addEmployee(String id, Employee employee) {
        employees.put(id, employee);
        System.out.println("Employee added: " + employee);
    }

    public void updateEmployee(String id, String position, double salary) {
        Employee employee = employees.get(id);
        if (employee != null) {
            employee.setPosition(position);
            employee.setSalary(salary);
            System.out.println("Employee updated: " + employee);
        } else {
            System.out.println("Employee not found.");
        }
    }

    public void removeEmployee(String id) {
        Employee employee = employees.remove(id);
        if (employee != null) {
            System.out.println("Employee removed: " + employee);
        } else {
            System.out.println("Employee not found.");
        }
    }

    public void displayEmployee(String id) {
        Employee employee = employees.get(id);
        if (employee != null) {
            System.out.println("Employee details: " + employee);
        } else {
            System.out.println("Employee not found.");
        }
    }
}
