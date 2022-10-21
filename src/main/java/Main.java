import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to the calculator");

        Calculator calculator = new Calculator();

        while (true){
            System.out.println("Enter a command (try help):");
            String command = in.nextLine();
            if (command.equalsIgnoreCase("exit")) break;
            String[] tokens = command.split(" ");
            try{
                switch (tokens[0].toLowerCase(Locale.ROOT)){
                    case "add":
                        System.out.println(calculator.add(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2])));
                        break;
                    case "subtract":
                        System.out.println(calculator.subtract(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2])));
                        break;
                    case "multiply":
                        System.out.println(calculator.multiply(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2])));
                        break;
                    case "divide":
                        System.out.println(calculator.divide(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2])));
                        break;
                    case "fibonacci":
                        System.out.println(calculator.fibonacciNumberFinder(Integer.parseInt(tokens[1])));
                        break;
                    case "binary":
                        System.out.println(calculator.intToBinaryNumber(Integer.parseInt(tokens[1])));
                        break;
                    default:
                        System.out.println("add a b");
                        System.out.println("subtract a b");
                        System.out.println("multiply a b");
                        System.out.println("divide a b");
                        System.out.println("fibonacci a");
                        System.out.println("binary a");
                        break;
                }
            } catch (Exception ignored){
                System.out.println("Invalid command, try again");
            }
        }
    }
}
