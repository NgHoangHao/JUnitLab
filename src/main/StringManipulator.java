package main;

import java.util.Scanner;

public class StringManipulator {
    static Scanner sc = new Scanner(System.in);

    // input: ExAmPLE => output: ELPmAxE
    public String reverse(String input) {
        String reverseString = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverseString += input.charAt(i);

        }

        return reverseString;
    }

    // input: example => output: false
    // input: ELpmpLE => output: true
    public boolean isPalindrome(String input) {
        String reverseString = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverseString += input.charAt(i);
        }
        if (reverseString.equals(input))
            return true;
        return false;
    }

    // input: ExAmPLE, part: Ex => output: true
    // input: ExAmPLE, part: ex => output: false
    public boolean isContained(String input, String part) {
        if (input.indexOf(part) != -1)
            return true;
        return false;
    }

    // input: ExAm1PLE2 => output: ExAmPLE
    public String numberRemoved(String input) {
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i)))
                newString.append(input.charAt(i));
        }
        return newString.toString();
    }

    // input: ExAmPLE => output: EXAMPLE
    public String upperString(String input) {
        String newString = input.toUpperCase();
        return newString;
    }

    // input: ExAmPLE => output: example
    public String lowerString(String input) {
        String newString = input.toLowerCase();
        return newString;
    }

    // input: example string => output: Example String
    public String capitalString(String input) {
        String[] splitName = input.split(" ");
        String string = "";
        for (int i = 0; i < splitName.length; i++) {
            string += splitName[i].substring(0, 1).toUpperCase();
            string += splitName[i].substring(1).toLowerCase() + " ";

        }
        return string.trim();
    }

    // input: Example => output: 3
    public int countVowels(String input) {
        int count = 0;
        String vowel = "ueoaiUEOAI";
        String[] splitString = input.split("");
        for (int i = 0; i < splitString.length; i++) {
            if (vowel.indexOf(splitString[i]) != -1)
                count++;
        }
        return count;
    }

    // input: Hello, how are you? => output: 4
    public int countWords(String sentence) {
        String []splitString= sentence.split(" ");
        return splitString.length;
    }

    // Input: input = "Java programming", substring = "programming" => Output: 5
    // Input: input = "Java programming", substring = "Programming" => Output: -1
    public int findSubstringIndex(String input, String substring) {
        
        return input.indexOf(substring);
    }

    // Input: "Hello World How Are You" => Output: "You Are How World Hello"
    public String reverseWords(String sentence) {
        String[] splitString= sentence.split(" ");
        String newString="";
        for(int i=splitString.length-1;i>=0;i--){
            newString+=splitString[i]+" ";

        }
        return newString.trim();
    }
}
