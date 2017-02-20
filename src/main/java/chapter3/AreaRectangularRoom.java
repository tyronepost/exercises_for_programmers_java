package chapter3;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

import static java.lang.String.format;
import static java.lang.System.in;
import static java.lang.System.out;

public class AreaRectangularRoom {
    private static double SQUARE_METER_CONVERSION_FACTOR = 0.09290304;
    private static Scanner scanner = new Scanner(in);

    public static void main(String[] args) {
        int length = getNumericInput("What is the length of the room in feet? ");
        int width = getNumericInput("What is the width of the room in feet? ");
        out.println(format("You entered dimensions %d feet by %d feet.", length, width));

        int areaInFeet = length * width;
        double areaInMeters = areaInFeet * SQUARE_METER_CONVERSION_FACTOR;
        out.println(format("%d square feet", areaInFeet));
        out.println(format("%f square meters", areaInMeters));
    }

    private static int getNumericInput(String message) {
        String input = getInput(message);
        while (!StringUtils.isNumeric(input)) {
            out.println("Input must be numeric");
            input = getInput(message);
        }
        return Integer.parseInt(input);
    }

    private static String getInput(String message) {
        promptUser(message);
        return scanner.next();
    }

    private static void promptUser(String message) {
        out.print(message);
    }
}
