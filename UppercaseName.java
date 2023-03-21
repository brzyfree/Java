// Program that asks the user’s name, and then greets the user by name in UPPERCASE.
import java.util.Scanner;

public class UppercaseName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Ask user for their name 
        System.out.print("What is your name? ");
        String name = input.nextLine();

        // Make name upper case
        String upperName = name.toUpperCase();

        // Greet user with uppercase name
        System.out.println("Hello, " + upperName + ", nice to meet you!");

        input.close();
    }
}

