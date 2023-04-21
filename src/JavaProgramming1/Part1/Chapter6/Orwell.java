package JavaProgramming1.Part1.Chapter6;
import java.util.Scanner;
public class Orwell {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Give a number:");
        int number = Integer.valueOf(reader.nextLine());

        if (number == 1984) {
            System.out.println("Orwell");
        }
    }
}
