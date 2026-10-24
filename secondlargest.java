class secondlargest{
    public static void main(String a[]){
        int[] arr={12,45,7,45,32,32,18};
        int max=Integer.MIN_VALUE;
        int sm=Integer.MIN_VALUE;
        for (int n:arr){
            if (n>max){
                sm=max;
                max=n;
            }
            else if (n<max && n>sm){
                sm=n;
            }
        }
        if (sm==Integer.MIN_VALUE) {
            System.out.println("No second largest distinct element");
        } else {
            System.out.println("The second largest element is: "+sm);
        }
    }
}