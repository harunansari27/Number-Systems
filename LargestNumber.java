import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {
        int arr[], size;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");

        size = scan.nextInt();
        arr = new int[size];

        System.out.print("Enter the array element :");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        int max = max_num(arr, size);

        System.out.println("The largest number among this array is : " + max);
    }

   public static int max_num(int[] arr, int size) {

        int maxi = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] > maxi) {
                maxi = arr[i];
            }
        }

        return maxi;
    }
}
