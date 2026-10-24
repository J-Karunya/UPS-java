import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
class Student{
    int rollnumber;
    String name;
    int marks;
    Student (int rollnumber,String name,int marks){
        this.rollnumber=rollnumber;
        this.name=name;
        this.marks=marks;
    }
    void display(){
        System.out.println(rollnumber+" "+name+" "+marks);
    }
}
class studentarraylist{
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        ArrayList<Student> arr=new ArrayList<>();
        arr.add(new Student(1,"Abby",59));
        arr.add(new Student(2,"Bob",70));
        arr.add(new Student(3,"Carolina",80));
        arr.add(new Student(4,"Daniel",99));
        arr.add(new Student(5,"Fazil",78));

    System.out.println("Students scoring above 75:");
    for (Student st:arr){
        if (st.marks>75){
            st.display();
        }
    }
    System.out.print("Enter roll number to search: ");
    int rn=sc.nextInt();
    Student found=null;
    for (Student st:arr){
        if (st.rollnumber==rn){
            found=st;
            break;
        }
    }
    if (found!=null){
        System.out.println("Student found");
        found.display();
    }
    else{
        System.out.println("Student not found");
    }
    System.out.print("Enter roll number to update: ");
    int rolln=sc.nextInt();
    System.out.print("Enter marks to update: ");
    int newmarks=sc.nextInt();
    boolean updated=false;
    for (Student st:arr){
        if (st.rollnumber==rolln){
            st.marks=newmarks;
            updated=true;
            break;
        }
    }
    if (updated){
        System.out.println("Student updated");
    }
    else{
        System.out.println("Student not found");
    }
    System.out.print("Enter roll number to delete: ");
    int rrn=sc.nextInt();
    boolean removed=false;
    for (int i=0;i<arr.size();i++){
        if (arr.get(i).rollnumber==rrn){
            arr.remove(i);
            removed=true;
            break;
        }
    } 
    if (removed){
        System.out.println("Student removed");
    }
    else{
        System.out.println("Student not found");
    }
    Collections.sort(arr, Comparator.comparingInt(st->st.marks));
    System.out.println("Students sorted by marks:");
    for (Student st : arr) {
        st.display();
    }

    sc.close();

}
}