package JavaProgramming1.Part1.Chapter6;
import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Give a number:");
        int number = Integer.valueOf(reader.nextLine());

        if (number % 2 == 0) {
            System.out.println("Number " + number + " is even.");
        } else {
            System.out.println("Number " + number +  " is odd.");
        }
    }
}
