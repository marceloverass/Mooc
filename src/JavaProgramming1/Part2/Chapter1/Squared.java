package JavaProgramming1.Part2.Chapter1;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Squared {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number = Integer.valueOf(reader.nextLine());
        int square = number * number;

        System.out.println(square);
    }


}
