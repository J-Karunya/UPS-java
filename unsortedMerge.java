import java.util.*;
class unsortedMerge {
    public static int[] mergeSort(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        int k = 0;
        for (int x : arr1) {
            int j = k - 1;
            while (j >= 0 && merged[j] > x) {
                merged[j + 1] = merged[j];
                j--;
            }
            merged[j + 1] = x;
            k++;
        }
        for (int x : arr2) {
            int j = k - 1;
            while (j >= 0 && merged[j] > x) {
                merged[j + 1] = merged[j];
                j--;
            }
            merged[j + 1] = x;
            k++;
        }
        return merged;
    }

    public static void  main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements for array 1:");
        int n1=sc.nextInt();
        int arr1[]=new int[n1];
        for (int i=0;i<n1;i++){
            System.out.println("Enter element "+(i+1));
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter number of elements for array 2:");
        int n2=sc.nextInt();
        int arr2[]=new int[n2];
        for (int i=0;i<n2;i++){
            System.out.println("Enter element "+(i+1));
            arr2[i]=sc.nextInt();
        }
        int[] res=mergeSort(arr1,arr2);
        int rn=res.length;
        for (int i=0;i<rn;i++){
            System.out.print(res[i]+" ");
        }
    }
}