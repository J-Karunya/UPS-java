import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
class studentmgs{
    public static void main(String []a){
        File file=new File("Student Details.txt");
        try{
            if (file.createNewFile()==true){
            System.out.println("Successfully created file");
            }
            else{
                System.out.println("File already exists");
            }
            FileWriter writer=new FileWriter("Student Details.txt");
            writer.write("Name: Karunya\nAge:20\nDept: AI&DS");
            writer.close();
            FileReader reader=new FileReader("Student Details.txt");
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
        }
        catch (IOException e){
            System.out.println("An error occured"+e.getMessage());
        }
        
        
    }
}