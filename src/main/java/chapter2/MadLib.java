package chapter2;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class MadLib {
    public static void main(String[] args) {
        String template = "Do you %s your %s %s %s? That's hilarious";
        String noun, verb, adjective, adverb;
        Scanner scanner = new Scanner(in);
        out.print("Enter a noun: ");
        noun = scanner.nextLine();
        out.print("Enter a verb: ");
        verb = scanner.nextLine();
        out.print("Enter an adjective: ");
        adjective = scanner.nextLine();
        out.print("Enter an adverb: ");
        adverb = scanner.nextLine();
        out.println(String.format(template, verb, adjective, noun, adverb));
    }
}
