// Program that helps the user count their change.
import java.util.Scanner;

public class CountChange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user how many quarters
        System.out.print("How many quarters do you have? ");
        int quarters = input.nextInt();

        // Ask user how many dimes
        System.out.print("How many dimes do you have? ");
        int dimes = input.nextInt();

        // Ask user how many nickels
        System.out.print("How many nickels do you have? ");
        int nickels = input.nextInt();

        // Ask user how many pennies
        System.out.print("How many pennies do you have? ");
        int pennies = input.nextInt();

        // Calculate total amount of money in dollars
        double totalMoney = (quarters * 0.25) + (dimes * 0.1) + (nickels * 0.05) + (pennies * 0.01);

        // Print total out to user
        System.out.println("You have $" + totalMoney);

        input.close();
    } 
}