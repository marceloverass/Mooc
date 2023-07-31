package JavaProgramming1.Part2.Chapter3;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Give a number: ");
        int number = Integer.valueOf(scan.nextLine());
        int mult = 1;

        for (int i = 1; i <= number; i++) {
            mult *= i;
        }
        System.out.println(mult);
    }
}
