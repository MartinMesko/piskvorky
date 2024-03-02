package sk.martinmesko;

import java.util.Scanner;

public class App {
    final static char PRAZDNO = ' ';
    final static char X = 'X';
    final static char O = 'O';
    static char hraTerazHrac = X;
    static char[][] board = {{PRAZDNO, PRAZDNO, PRAZDNO}, {PRAZDNO, PRAZDNO, PRAZDNO}, {PRAZDNO, PRAZDNO, PRAZDNO}};

    public static void main(String[] args) {
        while (!koniecHry()) {
            zobrazenieHracejPlochy();
            int input = vstupOdHraca();
            aktualizaciaHry(input);
        }
    }

    public static void zobrazenieHracejPlochy() {
        for (char[] riadok : board) {
            for (int i = 0; i < riadok.length / 3; i++) {
                System.out.println(riadok[0] + " | " + riadok[1] + " | " + riadok[2]);
                System.out.println("---------");
            }
        }
    }

    //ziskanie vstupu od hraca
    public static int vstupOdHraca() {
        int input = 0;
        System.out.println("Hráč " + hraTerazHrac + " zadaj číslo medzi 1 až 9 \n");
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
    public static void aktualizaciaHry(int input) {
            board[(input-1) / 3][(input-1) % 3] = hraTerazHrac;
            hraTerazHrac = (hraTerazHrac == X) ? O : X;
    }

    //kontrola riadkov
    public static boolean riadky() {
        for(char[]riadky : board)
        {
            if (riadky[0] == hraTerazHrac && riadky[1] == hraTerazHrac && riadky[2] == hraTerazHrac)
            {

                System.out.println("Vyhral hráč " + hraTerazHrac);
                return true;
            }
        }
        return false;
    }


    //kontrola stĺpcov
    public static boolean stlpce() {
        return false;
    }

    //kontrola diagonal
    public static boolean diagonaly() {

        return false;
    }

    //koniecHry
    public static boolean koniecHry() {
        if (riadky() || stlpce() || diagonaly()) {
            return true;
        }
        return false;
    }
}
