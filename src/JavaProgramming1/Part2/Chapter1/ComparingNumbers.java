package JavaProgramming1.Part2.Chapter1;
import java.util.Scanner;
public class ComparingNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNumber = Integer.valueOf(scan.nextLine());
        int secondNumber = Integer.valueOf(scan.nextLine());

        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " is greater than " + secondNumber);
        } else {
            System.out.println(secondNumber + " is greater than " + firstNumber);
        }
    }
}
