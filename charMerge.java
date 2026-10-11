import java.util.*;
class charMerge{
    public static char[] merge(char[] arr1,char[] arr2){
        int n1=arr1.length;
        int n2=arr2.length;
        char merged[]=new char[n1+n2];
        for (int i=0;i<n1;i++){
            merged[i]=arr1[i];
        }
        for (int i=0;i<n2;i++){
            merged[n1+i]=arr2[i];
        }
        return merged;
    }
    public static void  main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements for array 1:");
        int n1=sc.nextInt();
        char arr1[]=new char[n1];
        for (int i=0;i<n1;i++){
            System.out.println("Enter element "+(i+1));
            arr1[i]=sc.next().charAt(0);
        }
        System.out.println("Enter number of elements for array 2:");
        int n2=sc.nextInt();
        char arr2[]=new char[n2];
        for (int i=0;i<n2;i++){
            System.out.println("Enter element "+(i+1));
            arr2[i]=sc.next().charAt(0);
        }
        System.out.println(merge(arr1, arr2));
        System.out.print(Arrays.toString(merge(arr1,arr2)));
    }
}