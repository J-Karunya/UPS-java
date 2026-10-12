import java.util.Scanner;
class StuArrayClass{
    String StudentName;
    int age;
    int rollNo;

    public StuArrayClass(String StudentName, int age, int rollNo){
        this.StudentName=StudentName;
        this.age=age;
        this.rollNo=rollNo;
    }
    
    public static void display(){
        Scanner sc=new Scanner(System.in);
        Scanner scstr=new Scanner(System.in);
        System.out.println("Enter number of students:");
        int n=sc.nextInt();
        StuArrayClass[] stuarr=new StuArrayClass[n];
        for (int i=0;i<n;i++){
            System.out.println("Enter Name of Student "+(i+1)+":");
            String name = scstr.nextLine();
            System.out.println("Enter Age of Student " +(i+1)+":");
            int age = sc.nextInt();
            System.out.println("Enter Roll No of Student " +(i+1)+":");
            int rollNo = sc.nextInt();
            sc.nextLine();

            stuarr[i] = new StuArrayClass(name, age, rollNo);
        }
        for (StuArrayClass Student:stuarr){
            System.out.println("Student Name:"+Student.StudentName);
            System.out.println("Age:"+Student.age);
            System.out.println("Roll Number:"+Student.rollNo);
        }

    }

    public static void main(String []a){
            display();
    }
}