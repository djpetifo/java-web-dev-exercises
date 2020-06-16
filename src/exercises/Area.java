package exercises;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length of your rectangle: ");
        int length = input.nextInt();
        System.out.println("Please enter the width of your rectangle: ");
        int width = input.nextInt();
        input.close();

        System.out.println("The area of your rectangle is: " + length * width);
    }
}
