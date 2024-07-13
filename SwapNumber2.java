// Swap two number without using third Varible 

import java.util.Scanner;

public class SwapNumber2 {

    public static void main(String[] args) {
        int a, b;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first Number : ");
        a = scan.nextInt();

        System.out.println("Enter the Second Number : ");
        b = scan.nextInt();

        System.out.println("Before swaping number A is : " + a + " number B is : " + b);

        a = a + b; // 5 , 7 == 5+7 = 12
        b = a - b; // 12-7 = 5
        a = a - b; // 12-5 = 7

        System.out.println("After swapping Number A is : " + a + " And Number B is : " + b);

    }

}
