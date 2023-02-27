package at.let.Lampe;

import java.util.ArrayList;
import java.util.List;

public class LampObject {
    private List<GlowingObject> glowingObjects;

    public LampObject() {
        this.glowingObjects = new ArrayList<>();
    }

    public void addGlowingObject(GlowingObject glowingObject){
        this.glowingObjects.add(glowingObject);
    }
    public void printNamesOfLightElements()
    {
        for( int i =0; i< glowingObjects.size();i++)
        {
        System.out.println(glowingObjects.get(i).getName());
        }
    }
    public void turnAllOn()
    {
        for( int i =0; i< glowingObjects.size();i++)
            if(glowingObjects.get(i).isOn()==false)
            {
                glowingObjects.get(i).setOn(true);
            }
    }
    public void turnOn(int glowingObject)
    {
        if(glowingObjects.get(glowingObject).isOn()==false)
        {
        glowingObjects.get(glowingObject).setOn(true);
        }
        else {
            System.out.println("Das Element ist bereits eingeschalten");
        }
    }

    public void overAveragePowerUsage(){
        int sum = 0;
        for( int i =0; i< glowingObjects.size();i++)
        {
        if(glowingObjects.get(i).isOn()==true)

            {
                sum = sum+glowingObjects.get(i).getPowerUsage();
            }
        }
        System.out.println("gesamter Stromverbrauch: "+sum);
    }
}
