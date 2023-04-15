package JavaProgramming1.Part1.Chapter4;
import java.util.Scanner;

public class BooleanInput {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Write something:");
        boolean something = Boolean.valueOf(reader.nextLine());
        System.out.println("True or false? " + something);
    }
}
