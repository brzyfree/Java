// A program that simulates rolling a pair of six-sided dice.

public class DiceRoll {
    public static void main(String[] args) {
        // generate a random number 1-6 for each die and store to a variable
        int die1 = (int)(Math.random()*6) + 1;
        int die2 = (int)(Math.random()*6) + 1;
        int total = die1 + die2; //add up total
        // print roll results out to user
        System.out.println("Your first die rolls a " + die1);
        System.out.println("Your second die rolls a " + die2);
        System.out.println("Your total roll is " + total);
    }
}
