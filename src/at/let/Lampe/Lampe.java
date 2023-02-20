package at.let.Lampe;

import at.let.Objects.Battery;
import at.let.Objects.GlowingObject;
import at.let.Objects.LampObject;

public class Lampe {
    public static void main(String[] args)
    {
        GlowingObject g1 = new GlowingObject( "H250-11","pink",3,true,100 );
        GlowingObject g2 = new GlowingObject( "H252-11","green",3,true,100 );
        GlowingObject g3 = new GlowingObject( "H233-11","blue",3,true,100 );
        GlowingObject g4 = new GlowingObject( "H251-11","red",3,false,100 );
        Battery b1 = new Battery(100);
        Battery b2 =new Battery(90);

        LampObject l1 = new LampObject();

        l1.addGlowingObject(g1);
        l1.addGlowingObject(g3);
        l1.printNamesOfLightElements();
    }
}
