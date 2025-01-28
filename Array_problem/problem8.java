// Find the total number of pairs in the array sum is equal to the given value

import java.util.Scanner;

public class problem8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = scanner.nextInt();

        System.out.println("enter the element in array");
        int[] arr = new int[size];
        
        for(int i =0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("enter your target value:");
        int target = scanner.nextInt();


        System.out.println(TargetSum(arr, target));

    }
    public static int TargetSum(int[] arr , int target){
        int n = arr.length;
        int count = 0;
        for(int i= 0; i < n; i++){
            for(int j=i + 1; j < n; j++){
                if(arr[i] + arr[j] == target){
                    count++;
                }
            }
        }
        return count;

    }

    
}
