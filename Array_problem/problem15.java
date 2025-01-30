

import java.util.Scanner;

// public class problem15 {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("enter the size of array: ");
//         int size = scanner.nextInt();
//         System.out.println("enter the element of array: ");
//         int[] arr = new int[size];

//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = scanner.nextInt();
//         }

//         System.out.println("enter k value: ");
//         int k = scanner.nextInt();

//         int[] rotateArray = rotate(arr ,k);
//         for(int num : rotateArray){
//             System.out.println(num + " ");
//         }
//     }

//     public static int[] rotate(int[] arr , int k){
//         int n = arr.length;
//         k = k % n;
//         int[] result = new int[n];
//         int j = 0;

//         for(int i=n-k; i < n; i++){

//             result[j++] = arr[i];

//         }

//         for(int i=0; i < n-k; i++){
//             result[j++] = arr[i];
//         }
//         return result;
//     }
// }

public class problem15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int size = scanner.nextInt();
        System.out.println("enter the element of array: ");
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("enter k value: ");
        int k = scanner.nextInt();

        rotate(arr, k);
        for(int num : arr){
            System.out.println(num + " ");
        }
    }

    public static void revere(int[] arr, int i, int j){
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void rotate(int[] arr, int k){
        int n = arr.length;
        k = k % n;

        revere(arr, n-k, n-1);
        revere(arr, n-k, n-k);
        revere(arr, 0, n-1);
    }
}