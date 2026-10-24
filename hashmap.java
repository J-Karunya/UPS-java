import java.util.HashMap;
class hashmap{
    public static void main(String a[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(1,2);
        map.put(1,7);// only the latest value makes it
        map.put(2,3);
        System.out.println(map);
        HashMap<Integer,Character> map1=new HashMap<>();
        map1.put(1,'k');
        map1.put(2,'a');
        map1.put(3,'r');
        map1.put(4,'u');
        System.out.println(map1.get(5));// null is printed
        System.out.println(map1);
    }
}