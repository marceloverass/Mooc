package JavaProgramming1.Part1.Chapter6;
import java.util.Scanner;
public class Positivity {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Give a number:");
        int number = Integer.valueOf(reader.nextLine());

        if (number > 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is not positive");
        }
    }
}
