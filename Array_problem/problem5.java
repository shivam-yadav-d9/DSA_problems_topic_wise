// import java.util.Scanner; // This line imports the Scanner class from the java.util package.

// public class problem5{    // This declares a public class named problem5.
//     public static void main(String[] args){     //This is the main method, the entry point of the program
//       Scanner sc = new Scanner(System.in);
//       System.out.println("enter your size");
//       int size = sc.nextInt();
      
//       int[] arr = new int[size];     // Initialized an array named arr with size;

//       for(int i=0; i<size; i++){     // for loop iterate over the array and  assign input value;
//         arr[i] = sc.nextInt();

//       }
//       for(int i=0;i<size;i++){
//         System.out.println("your element is:" + arr[i]);           // for loop iterate over the array and print the value
//       }

//     }
// }



// 2  
// In Java, arrays are reference types, meaning arr1 and arr2 are references pointing to the same array. When you initialize arr2 to arr1, both references point to the same memory location. As a result, any changes you make to the array through arr2 will directly affect arr1 and vice versa.

// import java.util.Scanner;


// class problem5 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter your size");


//         int size = sc.nextInt();
//         int[] arr1 = new int[size];
        
//         System.out.println("enter your first array element");
//         for(int i=0; i<arr1.length; i++){
//             arr1[i] = sc.nextInt();
//         }

//         for(int i=0; i<arr1.length; i++){
//             System.out.println("your element is:" + arr1[i]);
//         }


//         int[] arr2 = arr1;
//         arr2[0]=10;
//         arr2[1]=11;
//         for(int i=0; i<arr2.length; i++){
//              System.out.println("my another value is:" + arr2[i]);
//         }
//     }
    
// }



// second method for reference to array;

// import java.util.Scanner;
// import java.util.Arrays; // Corrected importimport java.util.*;


// class problem5 {
//             public static void main(String[] args){
//                 Scanner sc = new Scanner(System.in);
//                 int size = sc.nextInt();
//                 int[] arr1 = new int[size];

//                 for(int i=0; i<arr1.length; i++){
//                     arr1[i]= sc.nextInt();

//                 }

//                 // int[] arr2 = arr1.clone();
//                 // int[] arr2 = Arrays.copyOf(arr1 , arr1.length);  // Arrays.copyOf, and prints the elements of the cloned array.
//                 // int[] arr2 = Arrays.copyOfRange(arr1 ,0, 3);


//                 for(int i=0; i<arr2.length; i++){
//                     System.out.println("Clone the second" + arr2[i]);
//                 }
//             }
// }