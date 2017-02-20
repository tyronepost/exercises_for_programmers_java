package chapter3;

import java.util.Scanner;

import static java.lang.String.format;
import static java.lang.System.in;
import static java.lang.System.out;

public class PizzaParty {
    private static Scanner scanner = new Scanner(in);

    public static void main(String[] args) {
        int numberOfPeople, numberOfPizzas, slicesPerPizza;

        out.print("How many people? ");
        numberOfPeople = scanner.nextInt();
        out.print("How many pizzas do you have? ");
        numberOfPizzas = scanner.nextInt();
        out.print("How many slices per pizza? ");
        slicesPerPizza = scanner.nextInt();

        int totalSlices = numberOfPizzas * slicesPerPizza;

        int slicesPerPerson = getSlicesPerPerson(numberOfPeople, totalSlices);
        int leftOvers = getLeftovers(numberOfPeople, totalSlices);

        out.println(format("%d people with %d pizzas", numberOfPeople, numberOfPizzas));
        out.println(format("Each person gets %d pieces of pizza", slicesPerPerson));
        out.println(format("There are %d leftovers", leftOvers));
    }

    public static int getSlicesPerPerson(int numberOfPeople, int totalSlices) {
        return totalSlices / numberOfPeople;
    }

    public static int getLeftovers(int numberOfPeople, int totalSlices) {
        return totalSlices % numberOfPeople;
    }
}
