package chapter2;

import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.in;

public class CountingCharacters {
    public static void main(String[] args) {
        out.print("What is the input string? ");
        Scanner scanner = new Scanner(in);
        String str = scanner.next();
        int charCount = str.length();
        out.println(str + " has " + charCount + " characters");
    }
}
