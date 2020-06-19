package org.launchcode.java.demos.lsn2controlflowandcollections;

public class ArrayPractice {



    public static void main(String[] args) {
        String sentence = "I would not, could not, in a box. " +
                "I would not, could not with a fox. I will not " +
                "eat them in a house. I will not eat them with a mouse";
        for (String word : sentence.split(" ")) {
            System.out.println(word);
        }


    }

}
