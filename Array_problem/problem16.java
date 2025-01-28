// import java.util.Scanner;

// public class problem16 {
//     public static void main(String[] args){
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("enter the size");
//         int size = scanner.nextInt();
//         System.out.println("enter our elements: ");
//         int[] arr = new int[size];

//         for(int i= 0; i < arr.length; i++){
//             arr[i] = scanner.nextInt();
//         }
//     SortArray(arr);
//     System.out.println("sorted array: ");
//     for(int num : arr){
//         System.out.println(num + " ");
//     }
//     }

//     public static void SortArray(int[] arr){
//         int n = arr.length;
//         int zeroes = 0;

//         // Count the number of zeroes 
//         for(int i=0; i < n; i++){
//             if(arr[i] == 0){
//                 zeroes++;
//             }
//         }
//         // fill the array with 0s and 1s
//         for(int i= 0; i < n; i++){
//             if(i < zeroes){
//                 arr[i] = 0;
//             }
//             else{
//                 arr[i] = 1;
//             }
//         }

//     }
    
// }



import java.util.Scanner;

public class problem16 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size");
        int size = scanner.nextInt();
        System.out.println("enter our elements: ");
        int[] arr = new int[size];

        for(int i= 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }

    SortArray(arr);
    System.out.println("sorted array: ");
    for(int num : arr){
        System.out.println(num + " ");
    }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] =arr[j];
        arr[j] = temp;
    }
    public static void SortArray(int[] arr){
        int n = arr.length;
        int left = 0; int right = n - 1;
        while (left < right) {
            if(arr[left] ==1 && arr[right] ==0){
                swap(arr , left, right);
                left++;
                right--;
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
            
        }
    }


}


