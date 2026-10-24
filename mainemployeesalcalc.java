class employee{
    int Empid;
    String Empname;
    double sal;
    employee( int Empid, String Empname, double sal){
        this.Empid=Empid;
        this.Empname=Empname;
        this.sal=sal;
    }
    double calsal(){
        return sal;
    }
    void display(){
        System.out.println("Employee ID: "+Empid);
        System.out.println("Employee Name: "+Empname);
        System.out.println("Salary: "+calsal());
    }
}
class fulltimeemp extends employee{
    fulltimeemp (int id, String name, double sal){
        super(id,name,sal);
    }
    @Override
    double calsal() {
        return sal+(sal*0.20);
    }

}
class parttimeemp extends employee{
    int hoursworked;
    double hourlyrate;
    parttimeemp(int id, String name, int hoursworked, double hourlyrate) {
        super(id, name, 0);
        this.hoursworked = hoursworked;
        this.hourlyrate = hourlyrate;
    }

    double calsal() {
        return hoursworked * hourlyrate;
    }
}
class mainemployeesalcalc{
    public static void main(String a[]){
        employee e1 = new fulltimeemp(101, "Arun", 30000);
        employee e2 = new parttimeemp(102, "Priya", 80, 200);

        e1.display();
        e2.display();
    }
}