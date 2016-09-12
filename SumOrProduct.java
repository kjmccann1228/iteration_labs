package mccann.kurt;
import java.util.Scanner;
/**
 * Created by kurtmccann on 9/9/16.
 */
public class SumOrProduct {

    public Scanner scan = new Scanner(System.in);

    public int engine(){
        Scanner scan = new Scanner(System.in);
        int result = 0;
        System.out.println("Please enter a number: ");
        int n = this.getUserIntInput();
        System.out.println("If you'd like to multiply, enter 'm', to sum enter 's'");
        String choice = this.getUserStringInput();
        if(choice.equalsIgnoreCase("m"))
        {
            result = this.factorial(n);
            System.out.println("The result: "+result);
        }
        else if(choice.equalsIgnoreCase("s"))
        {
            result = this.sumFactorial(n);
            System.out.println("The result: "+result);
        }
        else
        {
            System.out.println("Invalid Input");
        }
        return result;

        }

        public String getUserStringInput(){
            return scan.nextLine();
        }

        public int getUserIntInput(){
            int integer= scan.nextInt();
            scan.nextLine();
            return integer;
        }



    public int sumFactorial(int num){
        int sum = 0;
        for(int i = 1 ; i < (num+1) ; i++) {
            sum += i;
        }
        return sum;
    }

    public int factorial(int num){
        int product = 1;
            for(int i = 1; i<num+1; i++)
            {
                product = product*i;
            }
        System.out.println(product);
        return product;
    }

    public static void main(String[] args) {
        SumOrProduct test1 = new SumOrProduct();
        test1.engine();
    }


}
