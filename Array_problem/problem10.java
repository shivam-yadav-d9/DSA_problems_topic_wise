// find the unique  value in the arrays  othe element are repeated


import java.util.Scanner;

public class problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your size of array");
        int size = scanner.nextInt();
        System.out.println("enter the elements of array");
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(" The unique element is: " +findUnique(arr));

    }

    public static int findUnique(int[] arr) {
        int result = 0;
        for(int i=0; i < arr.length; i++){
            result = result^arr[i];
        }
        return result;
    }

}
