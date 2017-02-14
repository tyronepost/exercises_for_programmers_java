package chapter2;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class PrintinqQuotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        out.print("What is the quote? ");
        String quote = scanner.nextLine();
        out.print("Who said it? ");
        String author = scanner.nextLine();
        out.println(String.format("%s says, \"%s\"", author, quote));
    }
}
