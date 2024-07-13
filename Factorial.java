import java.util.Scanner;

public class Factorial {
    
    public static void main (String[] args) {

        int  n , fact =1 ; 

        Scanner scan = new Scanner(System.in) ;

        System.out.println("Hello Harun , How are u ?");

        System.out.println("Enter the number : ");

        n = scan.nextInt() ;

        for(int i= 1 ; i<= n ; i++) {
            fact = fact*i ;
        }

        System.out.println("Factorial of this "+n+" number is :"+ fact);
    }
}
