
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static int readInt(String message) {
        while (true) {
            try {
                System.out.print(message);
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            }
        }
    }

    public static double readSalary(String message) {
        while (true) {
            try {
                System.out.print(message);
                double salary =
                    Double.parseDouble(sc.nextLine().trim());

                if (Double.isFinite(salary) && salary >= 0) {
                    return salary;
                }

                System.out.println("Salary must be non-negative.");

            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid salary.");
            }
        }
    }

    public static String readText(String message) {
        while (true) {
            System.out.print(message);
            String value = sc.nextLine().trim();

            if (!value.isEmpty() && !value.contains("|")) {
                return value;
            }

            System.out.println(
                "Input cannot be empty or contain |."
            );
        }
    }

    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();

        // Load existing records
        manager.loadFromFile();

        while (true) {
            System.out.println("\n===== EMPLOYEE RECORD MANAGER =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Search Employee");
            System.out.println("3. Update Salary");
            System.out.println("4. Delete Employee");
            System.out.println("5. Display All");
            System.out.println("6. Save and Exit");

            int choice = readInt("Enter your choice: ");

            switch (choice) {
                case 1:
                    int id = readInt("Enter ID: ");

                    if (id <= 0) {
                        System.out.println("ID must be positive.");
                        break;
                    }

                    String name = readText("Enter name: ");
                    String dept = readText("Enter department: ");
                    double salary = readSalary("Enter salary: ");

                    Employee emp =
                        new Employee(id, name, dept, salary);

                    manager.addEmployee(emp);
                    break;

                case 2:
                    id = readInt("Enter employee ID: ");

                    Employee found = manager.searchEmployee(id);

                    if (found != null) {
                        System.out.println(found);
                    } else {
                        System.out.println("Employee not found!");
                    }
                    break;

                case 3:
                    id = readInt("Enter employee ID: ");
                    salary = readSalary("Enter new salary: ");

                    manager.updateSalary(id, salary);
                    break;

                case 4:
                    id = readInt("Enter employee ID: ");
                    manager.deleteEmployee(id);
                    break;

                case 5:
                    manager.displayAll();
                    break;

                case 6:
                    manager.saveToFile();
                    System.out.println("Exiting application. Bye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
