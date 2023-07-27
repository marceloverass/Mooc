package JavaProgramming1.Part2.Chapter2;
import java.util.Scanner;
public class NumberOfNegativeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int totalNegativeNumbers = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scan.nextLine());

            if (number == 0) {
                break;
            }

            if (number < 0) {
                totalNegativeNumbers += 1;
            }
        }
        System.out.println("Number of numbers: " + totalNegativeNumbers);
    }
}

