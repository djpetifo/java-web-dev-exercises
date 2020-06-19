package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            arr.add(i);
        }

        System.out.println(sum(arr));
    }

    public static int sum(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void printFiveLetterWords(ArrayList<String> stringArr, Integer stringLength) {
        for(String word : stringArr) {
            if (word.length() == stringLength) {
                System.out.println(word);
            }
        }
    }

}
