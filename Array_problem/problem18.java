import java.util.Scanner;

public class problem18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size");
        int size = scanner.nextInt();
        System.out.println("enter our elements: ");
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        sortDecreasing(arr);
        System.out.println("result is : ");
        for (int num : arr) {
            System.out.println(num + " ");
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    public static void revere(int[] arr){
        int i=0, j= arr.length-1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
            
        }

    }

    public static int[] sortDecreasing(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;
        int[] arrDec = new int[n];
        int k = 0;

        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                arrDec[k++] = arr[left] * arr[left];
                left++;

            } else {
                arr[k++] = arr[right] * arr[right];
                right--;
            }

        }
        revere(arrDec);
    }
}
