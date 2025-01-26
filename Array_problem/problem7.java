
// check the array are sorted or not 

// import java.util.Scanner;

// public class problem7 {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter the size of the array:");

//         int size = scanner.nextInt();
//         int[] arr = new int[size];

//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = scanner.nextInt();
//         }

//         boolean check = isSorted(arr);
//         if (check) {
//             System.out.println("Array sorted");
//         } else {
//             System.out.println("not sorted");
//         }
//     }

//     public static boolean isSorted(int[] arr) {
//         boolean check = true;
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] < arr[i - 1]) {
//                 return false;
//             }
//         }
//         return true;
//     }

// }


//2.// sort the array elements;


// import java.util.Scanner;
// import java.util.Arrays;
// 
// public class SortArray {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input
//         System.out.println("Enter the size of the array:");

//         int size = scanner.nextInt(); // Read the size of the array
//         int[] arr = new int[size]; // Initialize the array

//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = scanner.nextInt(); // Read each element of the array
//         }

//         // Sorting the array
//         Arrays.sort(arr);

//         // Print sorted array elements
//         System.out.println("Array elements after sorting:");
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i]);
//         }

//         scanner.close(); // Good practice to close the Scanner
//     }
// }



// 3.//return first and second largest number in array


// import java.util.Scanner;
// import java.util.Arrays;

// public class problem7{
// j

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input
//         System.out.println("Enter the size of the array:");

//         int size = scanner.nextInt(); // Read the size of the array
//         int[] arr = new int[size]; // Initialize the array

//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = scanner.nextInt(); // Read each element of the array
//         }

//         int[] ans = SmallestLargest(arr);
//         System.out.println("smallest "+ans[0]);
//         System.out.println("smallest "+ans[1]);
    
//     }

//     public  static int[] SmallestLargest(int[] arr){
//         Arrays.sort(arr);
//         int[] ans = {arr[0],arr[arr.length -1]};
//         return ans;
//     }
// }


