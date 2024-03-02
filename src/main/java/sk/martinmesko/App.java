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

    //vstup od hraca


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


//    static int vstupOdHraca() {
//        System.out.println("Zadaj číslo medzi 1 až 9 \n");
//        Scanner scanner = new Scanner(System.in);
//        int input = 0;
//        while (true) {
//            if ((input >= 1 && input <= 9)||(!scanner.hasNextInt())) {
//                input = scanner.nextInt();
//            }
//            else {
//                System.out.println("Zadaj správnu hodnotu");
//                continue;
//            }
//        }
//    }
}




