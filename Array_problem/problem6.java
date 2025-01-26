// Count the number of occurences of particular elements in the given array;


// package Array_problem;

// public class problem6 {
//     public static void main(String[] args){
//         int[] arr= {5,6,5,2,5,8};
//         int x=5;
//         int count = 0;
//         for(int i=0; i<arr.length; i++){
//             if(arr[i]==x){
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
    
// }




// package Array_problem;

// import java.util.Scanner;

// class problem6 {
//     public static void main(String[] args){
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("enter size of array");
//         int size = scanner.nextInt();
//         int[] arr = new int[size];
//         for(int i=0; i<arr.length; i++){
//             arr[i] = scanner.nextInt();
//         }
//         System.out.println("enter your elements");
//         int count = 0;
//         int x = scanner.nextInt();
//         for(int i=0; i<arr.length; i++){
//             if(arr[i] == x){
//             count++;
//             }
//         }
//         System.out.println(count);
//     }
// }




// find the last occurence of an  element x in a given array;

import java.util.Scanner;

public class problem6 {

    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.println("enter your size");
       int size = scanner.nextInt();
       int[] arr = new int[size];
       for(int i=0; i< arr.length; i++){
        arr[i] =scanner.nextInt();
       }
       System.out.println("enter your element to find its last index");
       int x = scanner.nextInt();

       // Call the lastIndex function and print the result
       
int lasIndex = lastIndex(arr , x);
if(lasIndex != -1){
    System.out.print("last index " + lasIndex);
}
else{
    System.out.println("your element not found");
}

    }
    public static int lastIndex(int[] arr, int x){
        System.out.println("enter your element to find its last index");
        int lastIndexval = -1;
        for(int i=0; i < arr.length ;i++){
            if(arr[i] == x){
                lastIndexval = i;
            }
        }
        return lastIndexval;
    }
}



