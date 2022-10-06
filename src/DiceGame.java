import java.util.Random;
import java.util.Scanner;

public class DiceGame {

        public static void main(String[] args) {
        //Würfelspiel
        System.out.println("Wuerfelspiel");
        System.out.println("Jeder Spieler hat 6 Wuerfel. Bei diesem Spiel wird gegen den Computer gewürfelt. Wer eine höhere Anzahl gewürfelt hat, gewinnt!");
        System.out.println("Fuer Spielstart drücke: 1");
        Random random = new Random();
        Scanner scanner=new Scanner(System.in);
        int DiceRollsLeft =6;
        int UserSelection= 0;
        int PlayerResult = 0;
        int BotResult = 0;
        int PlayerRolls[]={0,0,0,0,0,0};
        int PlayersTurn=0;

        UserSelection= scanner.nextInt();
        if(UserSelection==1)
        {
                System.out.println("Gebe eine 1 ein, um zu wuerfeln:");
                do{
                        PlayersTurn= scanner.nextInt();
                        PlayerRolls[DiceRollsLeft-1]= random.nextInt(1, 7 );
                        System.out.print("Du hast eine "); System.out.print(PlayerRolls[DiceRollsLeft-1]);
                        System.out.println(" gewuerfelt");
                        DiceRollsLeft=DiceRollsLeft-1;

                }while(DiceRollsLeft != 0);
                for(int i=0;i<6;i++)
                {
                        PlayerResult=PlayerResult+PlayerRolls[i];
                }
                System.out.print("Deine Wuerfelsumme liegt bei: ");
                System.out.println(PlayerResult);
                BotResult= random.nextInt(6,37);
                System.out.print("Die Wuerfelsumme des Computers liegt bei: ");
                System.out.println(BotResult);
                if(PlayerResult==BotResult){
                        System.out.println("Unentschieden");
                }
                if(PlayerResult>BotResult){
                        System.out.println("Du hast gewonnen!");
                } else if (PlayerResult<BotResult) {
                        System.out.println("Du hast verloren!");
                }
        }
        else
        {

        }


    }
}
