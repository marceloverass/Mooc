package JavaProgramming1.Part1.Chapter6;
import java.util.Scanner;
public class Ancient {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Give a year:");
        int year = Integer.valueOf(reader.nextLine());

        if (year < 2015) {
            System.out.println("Ancient history!");
        }
    }
}
