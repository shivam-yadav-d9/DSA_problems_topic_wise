import java.util.Scanner;

public class problem12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int size = scanner.nextInt();
        System.out.println("enter the element of array: ");  // The program asks the user to eneter the size of array
        int[] arr = new int [size];

        for(int i= 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }

         int result = FirstElement(arr);   // the program calls the firstElement method and store in result 
         if(result != -1){
            System.out.println("the first reapting element is " + result);
         }
         else{
            System.out.println("not repeating");
         }
    }


    public static int FirstElement(int[] arr){
        int n = arr.length;              // Get the size of the arra
        for(int i=0; i < n; i++ ){
            for(int j=i+1; j < n; j++){
                if(arr[i] == arr[j]){   // if a match is found 
                    return arr[i];        // return the first repeating element
                }
            }
        }
        return -1;         // If no repeating element is found
    }
    
}

