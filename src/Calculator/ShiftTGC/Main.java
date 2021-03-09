/*
    Copyright (C) 2021 ShiftTGC
    Original git: https://github.com/ShiftTGC/Calculator_Re-write

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package Calculator.ShiftTGC;

import java.util.Scanner;

//Class > Functions/Methods > objects & variables (self-note).
//I will make this Java 8 compatible. Cuz a friend said that is the best to do due to compatibility.
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Makes a new Scanner object. Allows user to write.

        println(" -------------------------------");
        println("| Shift's Calculator - v2.2.15 |");
        println(" -------------------------------");
        println("");

        loop:
        while (true) { //Makes a loop
            try //meant to help catch any errors
            {

                print("Input value x: ");
                double x = input.nextDouble(); //Stores user input into variable "x"
//            println(""); //Skips to next line so things won't be connected.

                print("Input symbol: ");
                String symbol = input.next(); //Stores user input into variable "symbol"
//            println("");

                print("Input value y: ");
                double y = input.nextDouble(); //Stores user input into variable "y"
//            println("");

                println(x + symbol + y + "=" + math(symbol, x, y));
                println("");

                /*
                exit - variable
                .equalsIgnoreCase - Function - Tells it to ignore if it is a big y or a small Y
                 */
                while (true) { //Starts another loop
                    try {
                        print("Want to exit? (Y/N): ");
                        String exit = input.next();

                        if (exit.equalsIgnoreCase("y")) {
                            println("");
                            println("Have a nice day/night!");
                            input.close();
                            break loop;
                        } else if (exit.equalsIgnoreCase("n")) {
                            println("Resetting calculator");
                            println("");
                            break;
                        } else throw new Exception("User Didn't answer Y or N");
                    } catch (Exception e) {
                        println("ERROR:");
                        println(e.toString());
                        println("");
                    }

                }


            } catch (Exception e) {
                input = new Scanner(System.in); //Prevents a very specific loop
                println("ERROR");
                println("x and y can only be integers (between -2.147.483.648 to 2.147.483.648)");
                println("Symbols can only be:");
                println("\"+\" - Addition");
                println("\"-\" - Subtract");
                println("\"*\" - Multiply");
                println("\"/\" - Divide");
                println("\"%\" - Modulo");
            }
        }
    }


    private static double math(String symbol, double x, double y) throws Exception {
        switch (symbol) {
            case "+":
                return x + y;
            case "-":
                return x - y;
            case "*":
            case "x":
            case "X":
                return x * y;
            case "/":
                return x / y;
            case "%":
                return x % y;
        }
        throw new Exception("Illegal Symbol");
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