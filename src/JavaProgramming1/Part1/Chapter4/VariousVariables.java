package JavaProgramming1.Part1.Chapter4;
import java.util.Scanner;

public class VariousVariables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chicken = 3;
        double bacon = 5.5;
        String tractor = "None!";

        System.out.println("Chicken:");
        System.out.println(chicken);

        System.out.println("Bacon (kg):");
        System.out.println(bacon);

        System.out.println("Tractor:");
        System.out.println(tractor);

        System.out.println(" ");

        System.out.println("And finally, a summary:");
        System.out.println(chicken);
        System.out.println(bacon);
        System.out.println(tractor);
    }
}
