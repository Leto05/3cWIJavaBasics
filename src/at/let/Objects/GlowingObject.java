package at.let.Objects;

public class GlowingObject {
    private String Name;
    private String Color;
    private int powerUsage;
    private boolean on;

    public GlowingObject(String name, String color, int powerUsage, boolean on) {
        Name = name;
        Color = color;
        this.powerUsage = powerUsage;

        this.on = on;
    }

    public String getName() {
        return Name;
    }

    public String getColor() {
        return Color;
    }

    public int getPowerUsage() {
        return powerUsage;
    }

    public boolean isOn() {
        return on;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void setPowerUsage(int powerUsage) {
        this.powerUsage = powerUsage;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}