import java.util.Scanner;

public class multi1 {
    public static void main(String[] args){
    //    int[][] arr = new int[2][3];
    //     arr[0][0] = 1;
    //     arr[0][1] = 2;
    //     arr[0][2] = 3;
    //     arr[1][0] = 4;
    //     arr[1][1] = 5;
    //     arr[1][2] = 6;
    //     System.out.println(arr[0][0]);
    //     System.out.println(arr[0][1]);
    //     System.out.println(arr[0][2]);

    //     System.out.println(arr[1][0]);
    //     System.out.println(arr[1][1]);
    //     System.out.println(arr[1][2]);


    //    int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
    //    for(int i = 0; i < 3; i++){
    //     for(int j = 0; j< 3; j++){
    //         System.out.println(arr[i][j]);
    //     }
    //     System.out.println();
    //    }

    //    int[][] arr1 ={{11,12,13},{14,15,16},{17,18}};
    //    for(int i = 0; i < arr1.length; i++){    // Iterate over rows
    //     for(int j = 0; j < arr1[i].length; j++){    // Iterate over columns
    //         System.out.println(arr1[i][j] + " ");
    //     }
    //     System.out.println();
    //    }


    // Scanner scanner = new Scanner(System.in);
    // System.out.println("enter row");
    // int r = scanner.nextInt();
    // System.out.println("enter column");
    // int c = scanner.nextInt();
    // int[][] arr = new int[r][c];
    // System.out.println("enter elemnts");

    // for(int i= 0; i< r; i++){
    //     for(int j= 0; j< c; j++){
    //         arr[i][j] = scanner.nextInt();

    //     }

    // }
    
    // for(int i=0; i<r;i++){
    //     for(int j=0; j < c; j++){
    //         System.out.println(arr[i][j] + " ");

    //     }
    //     System.out.println(" ");
    // }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int r = scanner.nextInt();
        System.out.println("Enter number of columns:");
        int c = scanner.nextInt();

        int[][] arr = new int[r][c];

        System.out.println("Enter elements row-wise:");

        // Taking input
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        // Printing the matrix
        System.out.println("The matrix is:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " "); // Print in matrix form
            }
            System.out.println(); // New line for next row
        }

        scanner.close(); // Close scanner to prevent memory leak
    }


    
}
    

