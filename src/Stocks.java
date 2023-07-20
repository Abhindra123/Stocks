import java.util.Scanner;

public class Stocks {
    public static int stockCalc(int arr[]){
        int stock=Integer.MAX_VALUE;
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>stock){
                arr[i]=stock;
                index=i;
            }
        }

        int price=Integer.MIN_VALUE;
        for(int i=index+1;i<arr.length;i++){
            if(arr[i]<price){
                price=arr[i];
            }
        }
        return price-stock;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int profit=stockCalc(arr);
        System.out.println(profit);
    }
}