package JavaProgramming1.Part1.Chapter6;
import java.util.Scanner;
public class Adulthood {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = Integer.valueOf(reader.nextLine());

        if (age >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are not adult");
        }
    }
}