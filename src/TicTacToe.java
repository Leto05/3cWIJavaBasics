import com.sun.jdi.IntegerValue;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args)
    {
        System.out.println("Willkommen bei Tic Tac Toe");
        Scanner scanner=new Scanner(System.in);

        char[][] Board=new char[3][3];
        String SelectionOfUser = scanner.next();
        String[]Selection=SelectionOfUser.split(",");
        int ColumnSelectionX= Integer.valueOf(Selection[0]);
        int ColumnSelectionY= Integer.valueOf(Selection[1]);
        Board [ColumnSelectionX][ColumnSelectionY] ="x";

        for(int i =0; i<Board.length;i++)
        {
            for(int j=0;j< Board.length;j++)
            {
                System.out.print("|"+Board[i][j]);
            }
            System.out.println("|");
        }
    }
}
//Rest beim nächsten Mal