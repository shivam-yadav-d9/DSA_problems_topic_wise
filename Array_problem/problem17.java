import java.util.Scanner;

public class problem17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size");
        int size = scanner.nextInt();
        System.out.println("enter our elements: ");
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        EvenOdd(arr);
        System.out.println("your result is :");
        for(int num : arr){
            System.out.println(num + " ");
        }
    }

    // int[] arr: the array in which the elemnets will be swapped
    // int i : the index of first elemets to be swapped
    // int j : the index of the second element to be swapped
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void EvenOdd(int[] arr){
        int n = arr.length;
        int left = 0 ;int right= n -1;
        while (left < right) {
            if(arr[left] % 2== 1 && arr[right] % 2 == 0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left] % 2 == 0){
                left++;
            }
            if(arr[right] % 2 == 1){
                right--;
            }
            
        }

    }
}
