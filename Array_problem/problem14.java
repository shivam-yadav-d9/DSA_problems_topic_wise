import java.util.Scanner;

public class problem14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int size = scanner.nextInt();
        System.out.println("enter the element of array: ");
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] ReverseArray = ReverseArray(arr);
        for (int i : ReverseArray) {
            System.out.println(i);
        }
    }

    public static int[] ReverseArray(int[] arr) {
        int n = arr.length;
        int[] arrRev = new int[n];
        int j = 0;

        for (int i = n - 1; i >= 0; i--) {
            arrRev[j++] = arr[i];
        }

        return arrRev;
    }
}
