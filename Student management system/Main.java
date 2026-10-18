
import java.util.Scanner;

public class Main {

    static int readInt(Scanner sc, String message) {
        while (true) {
            System.out.print(message);

            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            }
        }
    }

    static String readName(Scanner sc) {
        while (true) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine().trim();

            if (!name.isEmpty()) {
                return name;
            }

            System.out.println("Name cannot be empty.");
        }
    }

    static int[] readMarks(Scanner sc) {
        int[] marks = new int[5];

        for (int i = 0; i < 5; i++) {
            while (true) {
                marks[i] = readInt(
                    sc, "Enter marks for subject " + (i + 1) + ": "
                );

                if (marks[i] >= 0 && marks[i] <= 100) {
                    break;
                }

                System.out.println("Marks must be between 0 and 100.");
            }
        }

        return marks;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ResultService service = new ResultService();

        while (true) {
            System.out.println("\n=== Student Result Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Display Topper");
            System.out.println("0. Exit");

            int choice = readInt(sc, "Enter your choice: ");

            switch (choice) {

                case 1: {
                    int roll = readInt(sc, "Enter roll number: ");
                    String name = readName(sc);
                    int[] marks = readMarks(sc);

                    try {
                        Student student = new Student(roll, name, marks);

                        if (service.addStudent(student)) {
                            System.out.println("Student added successfully.");
                        } else {
                            System.out.println("Roll number already exists.");
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                }

                case 2:
                    service.viewAllStudents();
                    break;

                case 3: {
                    int roll = readInt(sc, "Enter roll number to search: ");
                    Student student = service.findStudent(roll);

                    if (student != null) {
                        service.displayStudent(student);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                }

                case 4: {
                    int roll = readInt(sc, "Enter roll number to update: ");

                    if (service.findStudent(roll) == null) {
                        System.out.println("Student not found.");
                        break;
                    }

                    String name = readName(sc);
                    int[] marks = readMarks(sc);

                    try {
                        service.updateStudent(roll, name, marks);
                        System.out.println("Student updated successfully.");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                }

                case 5: {
                    int roll = readInt(sc, "Enter roll number to delete: ");

                    if (service.deleteStudent(roll)) {
                        System.out.println("Student deleted successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                }

                case 6: {
                    Student topper = service.getTopper();

                    if (topper != null) {
                        System.out.println("Topper: " + topper.getName());
                        service.displayStudent(topper);
                    } else {
                        System.out.println("No student records found.");
                    }
                    break;
                }

                case 0:
                    System.out.println("Exiting program.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
