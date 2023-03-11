package Unit2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Hausübung {
    static Integer mynumber = ThreadLocalRandom.current().nextInt(0, 100 + 1);
    static Integer tries = 0;


    public static void main(String[] args) {
        nextRound();

    }

    public static void nextRound() {
        tries++;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gebe eine Zahl ein");
        Integer number = scanner.nextInt();
        guess(number);


    }

    public static void guess(Integer number) {
        if (number == mynumber) {
            System.out.println("Du hast Richtig geraten");
            System.out.println("Du hast " +tries+ " Versuchen");
        } else {
            System.out.println("Du hast Falsch geraten");
            if (number < mynumber) {
                System.out.println("Deine Zahl ist zu klein");
            } else {
                System.out.println("Deine Zahl ist zu Groß");
            }
            nextRound();

        }
    }
}
