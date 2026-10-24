import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
class collections{
    public static void main(String a[]){

        //Array list: Benificial version of arrays(no fixed length and can have multiple data types)
        ArrayList<Object> arr=new ArrayList<>();
        arr.add(2);
        arr.add("me");
        arr.add('d');
        arr.add(78.9f);
        arr.add(6456365743L);
        arr.add(new int[]{3,4});
        int n=arr.size();
        System.out.println(arr);
        for (int i=0;i<n;i++){
            System.out.println(arr.get(i));
        }

        //Set:
        Set<Object> se=new HashSet<>();
        se.add(2);
        se.add(89.6);
        se.add("hello");
        se.add(5445675574537547L);
        se.add('f');
        se.add(new char[]{'j','k'});
        int s=se.size();
        System.out.println(se);
        for (Object obj : se) {
            System.out.println(obj);
        }

    }
}