package JavaProgramming1.Part2.Chapter2;
import java.util.Scanner;
public class AverageOfPositiveNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double average = 0;
        int sumOfNumbers = 0;
        int positiveNumbers = 0;

        while (true) {
            int number = Integer.valueOf(scan.nextLine());

            if (number == 0) {
                break;
            }

            if (number > 0) {
                sumOfNumbers += number;
                positiveNumbers += 1;
                average = (double) sumOfNumbers / positiveNumbers;
            }
        }
        if (positiveNumbers <= 0) {
            System.out.println("Cannot calculate average");
        } else {
            System.out.println(average);
        }
    }
}
