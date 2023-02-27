package at.let.Lampe;

import at.let.Objects.Battery;
import java.util.Scanner;

public class Lampe {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);

        GlowingObject g1 = new GlowingObject( "H250-11","pink",3,false,100 );
        GlowingObject g2 = new GlowingObject( "H252-11","green",3,false,100 );
        GlowingObject g3 = new GlowingObject( "H233-11","blue",3,true,100 );
        GlowingObject g4 = new GlowingObject( "H251-11","red",3,false,100 );


        LampObject l1 = new LampObject();

        l1.addGlowingObject(g1);
        l1.addGlowingObject(g3);
        l1.printNamesOfLightElements();

        System.out.println("Das wievielte Gluehelement wollen sie einschalten? (Index startet bei 0): ");

        int input = scanner.nextInt();
        l1.turnOn(input);
        //l1.turnAllOn();
        l1.printNamesOfLightElements();
        l1.overAveragePowerUsage();
    }
}
