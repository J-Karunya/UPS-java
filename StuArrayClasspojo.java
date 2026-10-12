import java.util.Scanner;
class StuArrayClasspojo{
    private String StudentName;
    private int age;
    private int rollNo;

    public StuArrayClasspojo(String StudentName, int age, int rollNo) {
        this.StudentName = StudentName;
        this.age = age;
        this.rollNo = rollNo;
    }

    // setter for StudentName:
    public void setStudentName(String StudentName){
        this.StudentName=StudentName;
    }
    // getter for StudentName:
    public String getStudentName(){
        return StudentName;
    }
    // setter for age:
    public void setage(int age){
        this.age=age;
    }
    // getter for age:
    public int getage(){
        return age;
    }
    // setter for rollNo:
    public void setrollNo(int rollNo){
        this.rollNo=rollNo;
    }
    // getter for rollNo:
    public int getrollNo(){
        return rollNo;
    }
    
    public static void display(){
        Scanner sc=new Scanner(System.in);
        Scanner scstr=new Scanner(System.in);
        System.out.println("Enter number of students:");
        int n=sc.nextInt();
        StuArrayClasspojo[] stuarr=new StuArrayClasspojo[n];
        for (int i=0;i<n;i++){
            System.out.println("Enter Name of Student "+(i+1)+":");
            String name = scstr.nextLine();
            System.out.println("Enter Age of Student " +(i+1)+":");
            int age = sc.nextInt();
            System.out.println("Enter Roll No of Student " +(i+1)+":");
            int rollNo = sc.nextInt();
            sc.nextLine();

            stuarr[i] = new StuArrayClasspojo(name, age, rollNo);
        }
        for (StuArrayClasspojo Student:stuarr){
            System.out.println("Student Name:"+Student.getStudentName());
            System.out.println("Age:"+Student.getage());
            System.out.println("Roll Number:"+Student.getrollNo());
        }

    }

    public static void main(String []a){
            display();
    }
}