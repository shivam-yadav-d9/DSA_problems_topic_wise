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
        System.out.println("enter your element");
        System.out.println(findUnique(arr));

    }

    public static int findUnique(int[] arr) {
        int n = arr.length;
        int ans = -1;
        for (int i = 0; i < n; i++) {
            for (int j=i+1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                ans = arr[i];
            }
        }
        return ans;
    }

}
