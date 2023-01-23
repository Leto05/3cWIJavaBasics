package at.let;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {

        System.out.println("Willkommen bei Tic Tac Toe");
        System.out.println("Um ein Symbol zu legen, gebe die gewuenschte Koordinate an. z.B. '1,1' um in der Mitte zu platzieren");
        boolean winner = false;
        char[][] Board = new char[3][3];
        Scanner scanner = new Scanner(System.in);
        int Restart=1;
        do{
        do {
            System.out.println("Eingabe Spieler 1");

            String SelectionOfUser = scanner.next();
            String[] Selection = SelectionOfUser.split(",");
            int ColumnSelectionX = Integer.valueOf(Selection[0]);
            int ColumnSelectionY = Integer.valueOf(Selection[1]);

            if (Board[ColumnSelectionX][ColumnSelectionY] == '\u0000')  // \u0000 leerer Wert
            {
                Board[ColumnSelectionX][ColumnSelectionY] = 'x';
            } else {
                System.out.println("Das Feld ist bereits belegt du Clown!");
            }

            for (int j = 0; j < Board.length; j++) {
                for (int b = 0; b < Board.length; b++) {
                    System.out.print("|" + Board[j][b]);
                }
                System.out.println("|");
            }
            System.out.print("|");

            System.out.println("Eingabe Spieler 2");
            SelectionOfUser = scanner.next();
            Selection = SelectionOfUser.split(",");
            ColumnSelectionX = Integer.valueOf(Selection[0]);
            ColumnSelectionY = Integer.valueOf(Selection[1]);

                        if (Board[ColumnSelectionX][ColumnSelectionY] == '\u0000')  // \u0000 leerer Wert
            {
                Board[ColumnSelectionX][ColumnSelectionY] = 'o';
            } else {
                System.out.println("Das Feld ist bereits belegt du Clown!");
            }

            for (int j = 0; j < Board.length; j++) {
                for (int b = 0; b < Board.length; b++) {
                    System.out.print("|" + Board[j][b]);
                }
                System.out.println("|");
            }

            for(int e = 0; e < Board.length;e++)
            {
                if(Board[e][0] == Board[e][1] && Board[e][1] == Board[e][2] && Board[e][0] !='\u0000')
                {
                    System.out.println(Board[e][0] + " hat gewonnen!");
                    winner=true;
                }
            }

            for(int e = 0; e < Board.length;e++)
            {
                if(Board[0][e] == Board[1][e] && Board[e][1] == Board[2][e] && Board[0][e] !='\u0000')
                {
                    System.out.println(Board[0][e] + " hat gewonnen!");
                    winner=true;
                }
            }
            if(Board[0][0] == Board[1][1] && Board[1][1] == Board[2][2] && Board[2][2] !='\u0000')
            {
                System.out.println(Board[1][1] + " hat gewonnen!");
                winner=true;
            }
            if(Board[0][2] == Board[2][0] && Board[2][0] == Board[1][1] && Board[2][0] !='\u0000')
            {
                System.out.println(Board[0][2] + " hat gewonnen!");
                winner=true;
            }

        }while (winner!=true) ;
        Restart=0;
        System.out.println("Fuer neues Spiel 1 eingeben");
        Restart= scanner.nextInt();}while(Restart==1);
        }
    }
