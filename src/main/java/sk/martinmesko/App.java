package sk.martinmesko;

/**
 * Hello world!
 *
 */
public class App 
{
    final static char X = 'X';
    final static char O = 'O';

    static char[][] board = new char[3][3];
    public static void main( String[] args )
    {
        System.out.println(printPlayBoard());
    }

    public static boolean printPlayBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        return false;
    }









}



