package JavaProgramming1.Part2.Chapter2;
import java.util.Scanner;
public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double average = 0;
        int totalOfNumbers = 0;
        int sumOfNumbers = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scan.nextLine());

            if (number == 0) {
                break;
            }

            if (number != 0) {
                totalOfNumbers += 1;
                sumOfNumbers += number;
                average = (double) sumOfNumbers / totalOfNumbers;
            }
        }
        System.out.println("Average of the numbers: " + average);
    }
}
