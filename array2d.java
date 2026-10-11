import java.util.Scanner;
class array2d{
    public static int[][] create(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int r=sc.nextInt();
        System.out.println("Enter number of columns:");
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;
        
    }
    public static int[][] add(int[][] arr1,int[][] arr2){
        int r=arr1.length;
        int c=arr1[0].length;
        int[][] arr=new int[r][c];
        for (int i=0;i<r;i++){
            for (int j=0; j<c;j++){
                arr[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        return arr;
    }
    public static void main(String a[]){
        int[][] arr1=create();
        int[][] arr2=create();
        int[][] finarr=add(arr1,arr2);
        int n=arr1.length;
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(finarr[i][j]+" ");
            }
            System.out.println();
        }
    }
}