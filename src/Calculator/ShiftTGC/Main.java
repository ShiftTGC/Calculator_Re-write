package Calculator.ShiftTGC;

import java.util.Scanner;

//Class > Functions/Methods > objects & variables (self-note)
//I will make this Java 8 compatible. Cuz a friend said that is the best to do due to compatibility
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Makes a new Scanner object. Allows user to write.

        println(" ------------------------------");
        println("| Shift's Calculator - v2.0.3 |");
        println(" ------------------------------");
    }

    public static void print(String text) //Makes a function named print
    {
        System.out.print(text); //Prints a line but doesn't go to next line
    }

    public static void println(String text) //Makes a function named println
    {
        System.out.println(text);
    }
}
