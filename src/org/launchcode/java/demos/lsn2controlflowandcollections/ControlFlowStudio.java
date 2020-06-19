package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class ControlFlowStudio {
//    Super bonus mission

    public static void main(String[] args) {
        String input = "";
        char[] charactersInInput;
        HashMap<Character, Integer> letters = new HashMap<>();

        try {
            File myFile = new File("C:\\Users\\darkm\\Desktop\\lc101\\java-web-dev-exercises\\src\\org\\launchcode\\java\\demos\\lsn2controlflowandcollections\\james.txt");
            Scanner readLine = new Scanner(myFile);
            while (readLine.hasNextLine()) {
                String data = readLine.nextLine();
                input += data.toUpperCase();
            }
            readLine.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }

        charactersInInput = input.toCharArray();

        for(char letter : charactersInInput) {
            if (!letters.containsKey(letter) && (int) letter > 64 && (int) letter < 123) {
                letters.put(letter, 1);
            } else if (letters.containsKey(letter)){
                letters.put(letter, (letters.get(letter) + 1));
            }
        }
        System.out.println(letters);
    }

//    Bonus mission
    /*
    public static void main(String[] args) {
        Scanner readLine = new Scanner(System.in);
        String input;
        char[] charactersInInput;
        HashMap<Character, Integer> letters = new HashMap<>();

        System.out.println("Hey kid. Want to count some letters? Enter a string");
        input = readLine.nextLine().toUpperCase();
        charactersInInput = input.toCharArray();

        for(char letter : charactersInInput) {
            if (!letters.containsKey(letter) && (int) letter > 64 && (int) letter < 123) {
                letters.put(letter, 1);
            } else if (letters.containsKey(letter)){
                letters.put(letter, (letters.get(letter) + 1));
            }
        }
        System.out.println(letters);
    }

     */

//  Studio solution
/*
    public static void main(String[] args) {
        String input = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInInput = input.toCharArray();
        HashMap<Character, Integer> letters = new HashMap<>();

        for(char letter : charactersInInput) {
            if (!letters.containsKey(letter)) {
                letters.put(letter, 1);
            } else {
                letters.put(letter, (letters.get(letter) + 1));
            }
        }
        System.out.println(letters);

    }

 */
}



