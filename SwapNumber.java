// import java.util.Scanner;

// class SwapNumber {

//     public static void main(String[] args) {
//         int a ,  b , temp ;

//         Scanner scan = new Scanner(System.in) ;
//         System.out.println("Enter the first number : ") ;
//         a = scan.nextInt() ;

//         System.out.println("Enter the Second Number : ");
//         b=scan.nextInt() ;

//         System.out.println("Before Swapping the A is : "+a+" And B : "+b);

//         temp = a ; 
//         a=b ; 
//         b = temp ;

//         System.out.println("After swaping the number A is : "+a+" And B is : "+b) ;

//     }

// }

// step 2 
// using method 

import java.util.Scanner;

class SwapNumber {

    public static void main(String[] args) {
        int a, b;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        a = scan.nextInt();

        System.out.print("Enter the second number: ");
        b = scan.nextInt();

        System.out.println("Before Swapping: A = " + a + ", B = " + b);

        // Call the swap method
       
        int[] swapped = swap(a, b);
        // Call the swap method: Calls the swap method with a and b as arguments and
        // stores the returned array in the swapped variable.

        a = swapped[0];
        b = swapped[1];

        // Assign swapped values: Assigns the swapped values from the swapped array to a
        // and b. swapped[0] contains the new value of a and swapped[1] contains the new
        // value of b.

        System.out.println("After Swapping: A = " + a + ", B = " + b);
    }

    public static int[] swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        return new int[] { a, b };
        // Return swapped values: Creates a new array containing the swapped values of a
        // and b, and returns this array.
    }
}
