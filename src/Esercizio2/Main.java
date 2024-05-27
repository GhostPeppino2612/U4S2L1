package Esercizio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        do {
            try {
                double risultato;
                Scanner scanner = new Scanner(System.in);
                System.out.println("Inserisci i chiilometri: ");
                int kilo = scanner.nextInt();
                System.out.println("Inserisci i litri: ");
                int litri = scanner.nextInt();
                risultato = (double) kilo / litri;
                System.out.println("Il risultato: " + risultato);

            } catch (ArithmeticException ex) {
                System.err.println("Non puoi dividere per zero!");
            }
        } while (true);
    }
}
