package chapter2;

import java.util.Calendar;
import java.util.Scanner;

import static java.lang.String.format;
import static java.lang.System.in;
import static java.lang.System.out;

public class RetirementCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        out.print("What is your current age? ");
        int currentAge = scanner.nextInt();
        out.print("At what age would you like to retire? ");
        int retirementAge = scanner.nextInt();

        int yearsRemaining = retirementAge - currentAge;
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int retirementYear = currentYear + yearsRemaining;

        out.println(format("You have %d years left until you can retire", yearsRemaining));
        out.println(format("It's %d, so you can retire in %d", currentYear, retirementYear));
    }
}
