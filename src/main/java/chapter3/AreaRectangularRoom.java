package chapter3;

import java.util.Scanner;

import static java.lang.String.format;
import static java.lang.System.in;
import static java.lang.System.out;

public class AreaRectangularRoom {
    private static double SQUARE_METER_CONVERSION_FACTOR = 0.09290304;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int length, width;

        out.print("What is the length of the room in feet? ");
        length = scanner.nextInt();
        out.print("What is the width of the room in feet? ");
        width = scanner.nextInt();
        out.println(format("You entered dimensions %d feet by %d feet.", length, width));

        int areaInFeet = length * width;
        double areaInMeters = areaInFeet * SQUARE_METER_CONVERSION_FACTOR;
        out.println(format("%d square feet", areaInFeet));
        out.println(format("%f square meters", areaInMeters));
    }
}
