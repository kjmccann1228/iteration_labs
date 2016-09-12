package mccann.kurt;
import java.util.Scanner;
/**
 * Created by kurtmccann on 9/9/16.
 */
public class SelectiveGreeter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = scan.next();
        {
            if (name.equals("Alice") || name.equals("Bob")) {
                System.out.println("Hello " + name);
            }
        }
    }
}
