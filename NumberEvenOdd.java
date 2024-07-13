import java.util.Scanner;

class NumberEvenOdd {

    public static void main (String[] args) {

        int x ;

         Scanner scan = new Scanner(System.in) ;

         System.out.println("Hello Harun , How are u ?");

         System.out.print("Enter the Number : ");

         x = scan.nextInt() ;

         if(x%2 == 0) {
            System.out.println("The Given Number "+x+" Is Even.") ;
         }
         else {
            System.out.println("The Given Number "+x+" Is Odd.") ;
         }
    }
}