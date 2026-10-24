
import java.util.*;
import java.io.*;

public class EmployeeManager {
    private ArrayList<Employee> employees = new ArrayList<>();
    private HashMap<Integer, Employee> employeeMap = new HashMap<>();
    private HashSet<Integer> employeeIds = new HashSet<>();

    private final String FILE_NAME = "employees.txt";

    // Add employee
    public boolean addEmployee(Employee e) {
        if (employeeIds.contains(e.getId())) {
            System.out.println("Employee ID already exists!");
            return false;
        }

        employees.add(e);
        employeeMap.put(e.getId(), e);
        employeeIds.add(e.getId());

        System.out.println("Employee added successfully!");
        return true;
    }

    // Search employee
    public Employee searchEmployee(int id) {
        return employeeMap.get(id);
    }

    // Update salary
    public boolean updateSalary(int id, double salary) {
        Employee e = employeeMap.get(id);

        if (e == null) {
            System.out.println("Employee not found!");
            return false;
        }

        e.setSalary(salary);
        System.out.println("Salary updated successfully!");
        return true;
    }

    // Delete employee
    public boolean deleteEmployee(int id) {
        Employee e = employeeMap.remove(id);

        if (e == null) {
            System.out.println("Employee not found!");
            return false;
        }

        employees.remove(e);
        employeeIds.remove(id);

        System.out.println("Employee deleted successfully!");
        return true;
    }

    // Display all employees
    public void displayAll() {
        if (employees.isEmpty()) {
            System.out.println("No employee records found.");
            return;
        }

        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    // Save employee records to a file
    public void saveToFile() {
        try (PrintWriter writer =
                     new PrintWriter(new FileWriter(FILE_NAME))) {

            for (Employee e : employees) {
                writer.println(
                    e.getId() + "|" +
                    e.getName() + "|" +
                    e.getDepartment() + "|" +
                    e.getSalary()
                );
            }

            System.out.println("Records saved successfully!");

        } catch (IOException e) {
            System.out.println("Error saving records: " + e.getMessage());
        }
    }

    // Load employee records when the application starts
    public void loadFromFile() {
        File file = new File(FILE_NAME);

        if (!file.exists()) {
            System.out.println("No previous records found. Starting fresh.");
            return;
        }

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(file))) {

            String line;

            while ((line = reader.readLine()) != null) {
                try {
                    String[] data = line.split("\\|", -1);

                    if (data.length != 4) {
                        continue;
                    }

                    int id = Integer.parseInt(data[0]);
                    String name = data[1];
                    String department = data[2];
                    double salary = Double.parseDouble(data[3]);

                    if (id <= 0 || name.trim().isEmpty()
                            || department.trim().isEmpty()
                            || !Double.isFinite(salary)
                            || salary < 0
                            || employeeIds.contains(id)) {
                        continue;
                    }

                    Employee e =
                        new Employee(id, name, department, salary);

                    employees.add(e);
                    employeeMap.put(id, e);
                    employeeIds.add(id);

                } catch (NumberFormatException ex) {
                    System.out.println("Skipping an invalid record.");
                }
            }

            System.out.println("Employee records loaded.");

        } catch (IOException e) {
            System.out.println("Error loading records: " + e.getMessage());
        }
    }
}
