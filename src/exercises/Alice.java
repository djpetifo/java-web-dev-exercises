package exercises;

import java.util.Scanner;

public class Alice {

    public static void main(String[] args) {
        String searchString = "Alice was beginning to get" +
                " very tired of sitting by her sister on" +
                " the bank, and of having nothing to do:" +
                " once or twice she had peeped into the" +
                " book her sister was reading, but it had" +
                " no pictures or conversations in it, 'and" +
                " what is the use of a book,' thought Alice" +
                " 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("What word would you like to search?");
        String word = input.nextLine();
        if(searchString.toLowerCase().contains(word.toLowerCase())){
            System.out.println("The string starts at index " + searchString.toLowerCase().indexOf(word) +
                    " and is " + word.length() + " letters long.");
            String str1 = searchString.substring(0, searchString.toLowerCase().indexOf(word));
            String str2 = searchString.substring(searchString.toLowerCase().indexOf(word) + word.length() + 1);
            System.out.println(str1 + str2);
        } else {
            System.out.println("false");
        }
    }
}
