import java.util.Scanner;

public class problem19 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the size of array");
        int n = scanner.nextInt();
        System.out.println("enter the elements of arrays");
        int[] arr =new int[n];

        for(int i=0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
      // calculated the prefix sum value 
        int[] result = prefixSum(arr);
        for(int num : result){
            System.out.println(num + " ");
        }

    }

    public static int[] prefixSum(int[] arr){
        int n = arr.length;
        for(int i=1; i < n; i++ ){
            arr[i] = arr[i] + arr[i - 1];

        }
        return arr;
    }
    
}
