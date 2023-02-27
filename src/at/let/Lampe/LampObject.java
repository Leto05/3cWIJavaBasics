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
        glowingObjects.get(i).setOn(true);
    }
    public void turnOn(GlowingObject glowingObject)
    {
        //glowingObjects.get().setOn(true);
    }

    public void overAllPowerUsage(){

    }
}
