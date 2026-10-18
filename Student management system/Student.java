
public class Student extends Result {

    private int rollNumber;
    private String name;
    private int[] marks;

    public Student(int rollNumber, String name, int[] marks) {
        setRollNumber(rollNumber);
        setName(name);
        setMarks(marks);
    }

    // Getter for roll number
    public int getRollNumber() {
        return rollNumber;
    }

    // Setter for roll number
    public void setRollNumber(int rollNumber) {
        if (rollNumber <= 0) {
            throw new IllegalArgumentException(
                "Roll number must be positive."
            );
        }
        this.rollNumber = rollNumber;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "Name cannot be empty."
            );
        }
        this.name = name;
    }

    // Getter for marks
    @Override
    public int[] getMarks() {
        return marks.clone();
    }

    // Setter for marks
    public void setMarks(int[] marks) {
        if (marks == null || marks.length != 5) {
            throw new IllegalArgumentException(
                "Enter exactly 5 subject marks."
            );
        }

        for (int mark : marks) {
            if (mark < 0 || mark > 100) {
                throw new IllegalArgumentException(
                    "Marks must be between 0 and 100."
                );
            }
        }

        this.marks = marks.clone();
    }
}
