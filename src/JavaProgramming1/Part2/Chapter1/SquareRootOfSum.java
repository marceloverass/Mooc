package JavaProgramming1.Part2.Chapter1;
import java.util.Scanner;
public class SquareRootOfSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNumber = Integer.valueOf(scan.nextLine());
        int secondNumber = Integer.valueOf(scan.nextLine());
        double squareRoot = Math.sqrt(firstNumber + secondNumber);

        System.out.println(squareRoot);
    }
}
