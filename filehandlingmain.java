
import java.io.*;
import java.util.Scanner;
class filehandlingmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = "students.txt";
        try {
            // STEP 1: Write five student records
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 1; i <= 5; i++) {
                System.out.println("Enter details for student " + i);
                System.out.print("ID: ");
                int id = Integer.parseInt(sc.nextLine());
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Marks: ");
                double marks = Double.parseDouble(sc.nextLine());
                bw.write(id + "," + name + "," + marks);
                bw.newLine();
            }
            bw.close();
            BufferedReader br=new BufferedReader(new FileReader(fileName));
            String line;
            double highestMarks = -1;
            String topper = "";
            System.out.println("\nAll Student Records:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                String[] data = line.split(",");
                String name = data[1];
                double marks = Double.parseDouble(data[2]);
                if (marks > highestMarks) {
                    highestMarks = marks;
                    topper = name;
                }
            }
            br.close();
            System.out.println("\nTopper: " + topper);
            System.out.println("Highest Marks: " + highestMarks);

         
            System.out.println("\nEnter new student details:");
            System.out.print("ID: ");
            int id = Integer.parseInt(sc.nextLine());
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Marks: ");
            double marks = Double.parseDouble(sc.nextLine());
            FileWriter appendWriter =new FileWriter(fileName, true);
            BufferedWriter appendBuffer =new BufferedWriter(appendWriter);
            appendBuffer.write(id + "," + name + "," + marks);
            appendBuffer.newLine();
            appendBuffer.close();
            System.out.println("New student appended successfully.");
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("ID and marks must be valid numbers.");
        }
        sc.close();
    }
}
