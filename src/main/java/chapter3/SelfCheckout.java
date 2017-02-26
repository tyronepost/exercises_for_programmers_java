package chapter3;

import java.util.Scanner;

import static java.lang.String.format;
import static java.lang.System.in;
import static java.lang.System.out;

public class SelfCheckout {

    private static final Scanner scanner = new Scanner(in);

    public static void main(String[] args) {
        int subtotal = 0;
        for (int i = 1; i <= 3; i++) {
            out.print(format("Enter the price of item %d: ", i));
            int price = scanner.nextInt();
            out.print(format("Enter the quantity of item %d: ", i));
            int quantity = scanner.nextInt();
            subtotal += price * quantity;
        }
        out.println(format("Subtotal: $%.2f", (float)subtotal));
    }
}
