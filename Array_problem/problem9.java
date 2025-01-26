
// Count the number of triplets where sum is equal to the given value x;

import java.util.Scanner;

public class problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = scanner.nextInt();
        System.out.println("enter the element of array");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("enter the target element");
        int target = scanner.nextInt();

        System.out.println(TargetSumTriplet(arr, target));

    }

    public static int TargetSumTriplet(int[] arr, int target){
        int n = arr.length;
        int count = 0;
        // Nested loops to find all triplets
        for(int i=0; i < n; i++){
            for(int j=i+1; j < n; j++){
                for(int k=j+1; k < n; k++){
                    // check if the sum of the triplet equals the target
                    if(arr[i] + arr[j] + arr[k] ==target){
                        count++;

                    }
                }
            }
        }
        return count;

    }

}
