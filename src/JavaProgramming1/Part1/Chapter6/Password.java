package JavaProgramming1.Part1.Chapter6;
import java.util.Scanner;
public class Password {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Password?");
        String password = reader.nextLine();

        if (password.equals("Caput Draconis")) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    }
}
