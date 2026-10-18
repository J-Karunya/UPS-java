
import java.util.ArrayList;
import java.util.List;

public class ResultService {

    private final List<Student> students = new ArrayList<>();

    public ResultService() {
        addStudent(new Student(101, "Arun",
            new int[]{85, 80, 90, 85, 85}));

        addStudent(new Student(102, "Priya",
            new int[]{95, 92, 96, 94, 93}));

        addStudent(new Student(103, "Ravi",
            new int[]{70, 75, 68, 72, 75}));
    }

    // CREATE: Add student
    public boolean addStudent(Student student) {
        if (findStudent(student.getRollNumber()) != null) {
            return false;
        }

        students.add(student);
        return true;
    }

    // READ: Find student by roll number
    public Student findStudent(int rollNumber) {
        for (Student stu : students) {
            if (stu.getRollNumber() == rollNumber) {
                return stu;
            }
        }

        return null;
    }

    // READ: Display all students
    public void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("There are no student records.");
            return;
        }

        for (Student stu : students) {
            displayStudent(stu);
        }
    }

    // Display one student
    public void displayStudent(Student student) {
        System.out.println("\nRoll Number: " + student.getRollNumber());
        System.out.println("Name: " + student.getName());
        System.out.println("Total: " + student.calculateTotal());
        System.out.println("Average: " + student.calculateAverage());
        System.out.println("Grade: " + student.calculateGrade());
    }

    // UPDATE
    public boolean updateStudent(
            int rollNumber, String name, int[] marks) {

        Student student = findStudent(rollNumber);

        if (student == null) {
            return false;
        }

        student.setName(name);
        student.setMarks(marks);
        return true;
    }

    // DELETE
    public boolean deleteStudent(int rollNumber) {
        Student student = findStudent(rollNumber);

        if (student == null) {
            return false;
        }

        students.remove(student);
        return true;
    }

    // Find topper
    public Student getTopper() {
        if (students.isEmpty()) {
            return null;
        }

        Student topper = students.get(0);

        for (Student stu : students) {
            if (stu.calculateAverage() > topper.calculateAverage()) {
                topper = stu;
            }
        }

        return topper;
    }
}
