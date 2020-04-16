import java.util.Scanner;
public class calSum {
    public static void main (String args[]) {
        // I will need a scanner variable, then a integer or double //
        // Calculate the user input to define the square of the number //
        // print the result from system output for displaying it //

        // This code is for the calculation of square by multiplication //
        // int y; // This is to initialization the integer of "y" //
        // y= y * y; //
        // To initialization first; means to create a memory space for the variable; //
        // then you would assign values to them //

        Scanner numInput = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = numInput.nextInt(); // << I am both initialization and assigning values at the same time.
        x = x * x;
        System.out.println("This is your result after squaring the number: " + "" + x);
        }
    }