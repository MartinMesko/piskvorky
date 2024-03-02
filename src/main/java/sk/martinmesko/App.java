package sk.martinmesko;

import java.util.Scanner;

public class App {
    final static char PRAZDNO = ' ';
    final static char X = 'X';
    final static char O = 'O';
    static char hraTeraz = X;
    static char[][] board = {{PRAZDNO, PRAZDNO, PRAZDNO}, {PRAZDNO, PRAZDNO, PRAZDNO}, {PRAZDNO, PRAZDNO, PRAZDNO}};

    public static void main(String[] args) {
        zobrazenieHracejPlochy();
        int input = vstupOdHraca();
        aktualizaciaHry(input);
        System.out.println(input);
        System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
    }

    static void zobrazenieHracejPlochy() {
        for (char[] riadok : board) {
            for (int i = 0; i < riadok.length / 3; i++) {
                System.out.println(riadok[0] + " | " + riadok[1] + " | " + riadok[2]);
                System.out.println("---------");
            }
        }
    }

    //ziskanie vstupu od hraca
    static int vstupOdHraca() {
        int input = 0;
        System.out.println("Zadaj číslo medzi 1 až 9 \n");
        while (true) {

            Scanner scanner = new Scanner(System.in);
            while (!scanner.hasNextInt()) {
                System.out.println("Zadaj číslo, nie znak!");
                scanner.next();
            }
            input = scanner.nextInt();

            if (input >= 1 && input <= 9) {
                break;
            }
            else {
                System.out.println("Zadaj správne číslo 1 - 9");
            }
        }
        return input;
    }

    //aktualizacia hry
    static void aktualizaciaHry(int input) {

        board[(input - 1) / 3][(input - 1) % 3] = hraTeraz;
        hraTeraz = (hraTeraz == X) ? O : X;
        zobrazenieHracejPlochy();

    }

}




