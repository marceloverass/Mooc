package JavaProgramming1.Part1.Chapter5;
import java.util.Scanner;

public class AverageOfTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Give the first number:");
        int n1 = Integer.valueOf(reader.nextLine());

        System.out.println("Give the second number:");
        int n2 = Integer.valueOf(reader.nextLine());

        double average = (n1 + n2) / 2;

        System.out.println("The average is " + average);
    }
}
