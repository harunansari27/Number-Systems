import java.util.Scanner;

class PrimeNumber {

    public static void main(String[] args) {

        int num;
        int count = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Hello Harun , How are u ?");

        System.out.println("Enter the number");

        num = scan.nextInt();

        for (int i=1 ; i<=num; i++) {
            if(num % i == 0) {
                count++ ;
            }
        }

        if(count == 2){
            System.out.println("The number is prime");
        }
        else{
            System.out.println("The number is not prime");
        }

    }
}

