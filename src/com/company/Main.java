package com.company;

import java.util.Scanner;
import java.util.ArrayList;
import java.lang.String;
public class Main {

    public static void main(String[] args) {
        String alpha = "true";
        while (alpha == "true") {
            // write your code here
            Scanner input = new Scanner(System.in);
            System.out.println("input text:");

            String inputText = input.next();
            int inputLength = inputText.length();
            ArrayList<String> letterList = new ArrayList<String>();
            int i = 0;
            while (i < inputLength) {
                char letter = inputText.charAt(i);
                String myLetter = Character.toString(letter);
                letterList.add(myLetter);
                i++;
            }
            letterList.add("");
            int nunOfLetter = 1;
            String outputString = "";
            String[] letters = letterList.toArray(new String[0]);

            for (int j = 0; j < letterList.toArray().length; j++) {
                String currentLetter = letters[j];
                if (j + 1 < letterList.toArray().length) {
                    String nextLetter = letters[j + 1];

                    if (currentLetter.equals(nextLetter)) {
                        nunOfLetter++;
                    } else {
                        outputString = outputString + nunOfLetter + currentLetter;
                        nunOfLetter = 1;
                    }
                }
            }
            System.out.println(outputString);
            System.out.println("input length:" + inputLength);
            int outputLength = outputString.length();
            System.out.println("output length:" + outputLength);
            int saved = inputLength - outputLength;
            System.out.println("saved length:" + saved);
            System.out.println("encode something else? 1 to go again");
            int decition = input.nextInt();
            if (decition != 1) {
                break;
            }
        }
    }
}
