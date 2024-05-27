package Esercizio1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[5];
        int num = 1;
        while (num != 0) {
            try {

                Scanner scanner = new Scanner(System.in);
                System.out.println("Inserisci il numero: ");
                num = scanner.nextInt();
                if (num <= 10 && num >= 1) {
                    System.out.println("In quale posizione inserire?");
                    int pos = scanner.nextInt();
                    if (pos < 0 || pos >= nums.length) {
                        System.out.println("Posizione non valida. Riprova.");
                        continue;
                    }
                    nums[pos] = num;
                    System.out.println(Arrays.toString(nums));
                }
            } catch (Exception e) {System.out.println("Errore nell'input. Riprova.");}
    }  }
}
