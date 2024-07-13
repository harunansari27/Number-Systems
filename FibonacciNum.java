import java.util.Scanner;

public class FibonacciNum {

    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int result;
        int num;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of Fibonacci numbers you want to see: ");
        num = scan.nextInt();

        System.out.print("Fibonacci Series: ");

        if (num >= 1) {
            System.out.print(a + " "); // Print the first Fibonacci number
        }

        if (num >= 2) {
            System.out.print(b + " "); // Print the second Fibonacci number
        }

        for (int i = 2; i < num; i++) { // Start loop from 2 as first two numbers are already printed
            result = a + b;
            System.out.print(result + " ");
            a = b;
            b = result;
        }

        System.out.println(); // To move to the next line after printing the series
    }
}

