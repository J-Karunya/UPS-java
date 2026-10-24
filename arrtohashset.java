import java.util.HashSet;
class arrtohashset{
    public static void main(String a[]){
        int[] arr={10, 20, 10, 30, 20, 40, 50, 30};
        HashSet<Integer> set=new HashSet<>();
        for (int i:arr){
            set.add(i);
        }
        System.out.println(set);
        System.out.println("The number of elements are: "+set.size());
        System.out.println("Contains 40? "+set.contains(40));
    }
}