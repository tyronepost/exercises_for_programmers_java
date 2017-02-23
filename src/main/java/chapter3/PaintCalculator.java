package chapter3;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;
import static java.lang.String.format;

public class PaintCalculator {

    private static final Scanner scanner = new Scanner(in);
    private static final int SQUARE_FEET_PER_GALLON = 350;

    public static void main(String[] args) {

        out.print("Ceiling length: ");
        int length = scanner.nextInt();
        out.print("Ceiling width: ");
        int width = scanner.nextInt();

        int squareFeet = length * width;
        int gallonsOfPaint = squareFeet / SQUARE_FEET_PER_GALLON;
        if (squareFeet % SQUARE_FEET_PER_GALLON > 0) {
             gallonsOfPaint += 1;
        }

        String template = "You will need to purchase %d gallon(s) of paint to cover %d square feet";
        out.println(format(template, gallonsOfPaint, squareFeet));
    }
}
