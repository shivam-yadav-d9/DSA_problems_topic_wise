import java.util.Scanner;

public class problem20 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n + 1];
        System.out.println("enter the elements of arrays");



        for(int i=1; i < n; i++){
            arr[i] = scanner.nextInt();

        }

        int[] prefix = prefixSum(arr);
        System.out.println("enter your query: ");
        int q = scanner.nextInt();
        while (q-- > 0) {
            System.out.println("enter your query: ");
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            int ans =  prefix[r] - prefix[l-1];
            System.out.println(ans +" ");
            
        }
    }
    public static int[] prefixSum(int[] arr){
        int n = arr.length;
        for(int i=0; i< n;i++){
            arr[i] = arr[i] + arr[i - 1];
        }
        return arr;
    }

    
}
