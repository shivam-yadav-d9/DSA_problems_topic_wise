
//  Second largest element in the arrays 


import java.util.Scanner;

public class problem11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = scanner.nextInt();
        System.out.println("Enter the elements of array:");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("second largest is :" + (SecondLargest(arr)));

    }

    public static int SecondLargest(int[] arr) {

        int largest = Integer.MIN_VALUE;        // largest is initialized to the smallest possible integer value
        int second = Integer.MIN_VALUE;         // it also 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                second = largest;            // Previous largest becomes second largest
                largest = arr[i];              // Update largest to the current element


            } else if (arr[i] > second && arr[i] != largest) {
                second = largest;      // / Update second largest to the current element
            }

        }
        return second;
    }

}
