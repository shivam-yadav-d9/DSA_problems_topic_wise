public class problem13 {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;

        swapNumber( a, b);
    
    }

    public static void swapNumber(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("after swap a is : " + a + "after swap b is :"+ b);


    }
    
}
