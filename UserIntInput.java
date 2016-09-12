package mccann.kurt;
import java.util.Scanner;

/**
 * Created by kurtmccann on 9/10/16.
 */
public class UserIntInput {
    int input;
    public int getUserInput(){
        Scanner scan = new Scanner(System.in);
        input = scan.nextInt();
        scan.nextLine();
        return input;
    }

}
