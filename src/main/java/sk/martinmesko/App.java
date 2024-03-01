package sk.martinmesko;

/**
 * Hello world!
 *
 */
public class App 
{
    final static char PRAZDNO = ' ';
    final static char X = 'X';
    final static char O = 'O';
    static char hraTeraz = X;
    static char[][] board = {{PRAZDNO, PRAZDNO, PRAZDNO}, {PRAZDNO, PRAZDNO, PRAZDNO}, {PRAZDNO, PRAZDNO, PRAZDNO}};
    public static void main( String[] args )
    {
        zobrazenieHracejPlochy();
    }

    static void zobrazenieHracejPlochy() {
        for (char[] riadok : board)
        {
            for (int i = 0; i < riadok.length/3; i++)
            {
                System.out.println(riadok[0] + " | " + riadok[1] + " | " + riadok[2]);
                System.out.println("---------");
            }
        }

    }
}



