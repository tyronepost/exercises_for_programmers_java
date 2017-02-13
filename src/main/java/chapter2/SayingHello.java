package chapter2;

import java.util.Scanner;

/**
 * Created by tyronepost on 2/12/17.
 */
public class SayingHello {
    public static void main(String[] args) {
        System.out.print("What is your name? ");
        System.out.println("Hello " + new Scanner(System.in).next() + ", nice to meet you!");
    }
}
