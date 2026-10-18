public abstract class Result{
    public abstract int[] getMarks();
    public int calculateTotal(){
        int total=0;
        for (int mark:getMarks()){
            total+=mark;
        }
        return total;
    }
    public double calculateAverage(){
        return calculateTotal()/5.0;
    }
    public String calculateGrade(){
        double average= calculateAverage();
        if (average>=90){
            return "A";
        }
        else if (average>=75){
            return "B";
        }
        else if (average>=60){
            return "C";
        }
        else if (average>=40){
            return "D";
        }
        else{
            return "F";
        }
    }
}