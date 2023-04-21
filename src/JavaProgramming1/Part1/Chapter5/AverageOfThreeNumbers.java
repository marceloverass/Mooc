package JavaProgramming1.Part1.Chapter5;
import java.util.Scanner;
public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Give the first number:");
        int n1 = Integer.valueOf(reader.nextLine());

        System.out.println("Give the second number:");
        int n2 = Integer.valueOf(reader.nextLine());

        System.out.println("Give the third number:");
        int n3 = Integer.valueOf(reader.nextLine());

        double average = (double) (n1 + n2 + n3) / 3;

        System.out.println("The average is " + average);
    }
}
