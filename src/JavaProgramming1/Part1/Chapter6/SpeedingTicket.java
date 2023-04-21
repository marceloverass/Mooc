package JavaProgramming1.Part1.Chapter6;
import java.util.Scanner;
public class SpeedingTicket {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Give speed:");
        int number = Integer.valueOf(reader.nextLine());

        if (number > 120) {
            System.out.println("Speeding ticket!");
        }
    }
}
