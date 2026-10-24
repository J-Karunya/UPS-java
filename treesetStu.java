import java.util.TreeSet;
import java.util.Collections;
class treesetStu{
    public static void main(String a[]){
        TreeSet<Integer> arr= new TreeSet<>(Collections.reverseOrder());// object is not possible...because treeset sorts the values.
        arr.add(23);
        arr.add(21);
        arr.add(86);
        System.out.println(arr);
    }
}