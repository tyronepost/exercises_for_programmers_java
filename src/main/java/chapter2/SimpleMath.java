package chapter2;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;
import static java.lang.String.format;

public class SimpleMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        out.print("What is the first number? ");
        int firstNumber = scanner.nextInt();
        out.print("What is the second number? ");
        int secondNumber = scanner.nextInt();
        out.println(format("%d + %d = %d", firstNumber, secondNumber, firstNumber + secondNumber));
        out.println(format("%d - %d = %d", firstNumber, secondNumber, firstNumber - secondNumber));
        out.println(format("%d * %d = %d", firstNumber, secondNumber, firstNumber * secondNumber));
        out.println(format("%d / %d = %d", firstNumber, secondNumber, firstNumber / secondNumber));
    }
}
