package JavaProgramming1.Part2.Chapter2;
import java.util.Scanner;
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sumOfNumbers = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scan.nextLine());

            if (number == 0) {
                break;
            }

            if (number != 0) {
                sumOfNumbers += number;
            }
        }
        System.out.println("Number of numbers: " + sumOfNumbers);
    }
}
