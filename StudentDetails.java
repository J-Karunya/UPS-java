import java.util.Scanner;
class StudentDetails{
    String StudentName;
    int age;
    int rollNo;
    
    public static void display(){
        Scanner sc=new Scanner(System.in);
        StudentDetails s1=new StudentDetails();
        System.out.println("Enter Name of Student 1:");
        s1.StudentName=sc.nextLine();
        System.out.println("Enter Age of Student 1:");
        s1.age=sc.nextInt();
        System.out.println("Enter Roll no of Student 1:");
        s1.rollNo=sc.nextInt();

        System.out.println(s1.StudentName);
        System.out.println(s1.age);
        System.out.println(s1.rollNo);

    }

    public static void main(String []a){
            display();
    }
}