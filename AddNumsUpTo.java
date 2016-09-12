package mccann.kurt;
import java.util.Scanner;

/**
 * Created by kurtmccann on 9/9/16.
 */
public class AddNumsUpTo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int numIn = scan.nextInt();
        int sum = 0;
        for (int i = 1; i < (numIn+1); i++) {
            sum += i;
        }
        System.out.println("The sum is: " + sum);
    }


}
