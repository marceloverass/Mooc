package JavaProgramming1.Part1.Chapter4;
import java.util.Scanner;
public class DifferentTypesOfInput {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Give a string:");
        String string = String.valueOf(reader.nextLine());

        System.out.println("Give an integer:");
        int number = Integer.valueOf(reader.nextLine());

        System.out.println("Give a double:");
        double floatNumber = Double.valueOf(reader.nextLine());

        System.out.println("Give a boolean:");
        boolean trueOrFalse = Boolean.valueOf(reader.nextLine());

        System.out.println("You gave the string " + string);
        System.out.println("You gave the integer " + number);
        System.out.println("You gave the double " + floatNumber);
        System.out.println("You gave the boolean " + trueOrFalse);
    }
}
