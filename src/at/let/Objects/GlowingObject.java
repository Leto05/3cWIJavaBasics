package at.let.Objects;

public class GlowingObject {
    private String Name;
    private String Color;
    private int powerUsage;
    private boolean on;
    private int status;

    public GlowingObject(String name, String color, int powerUsage, boolean on, int status) {
        this.Name = name;
        this.Color = color;
        this.powerUsage = powerUsage;
        this.on = on;
        this.status=status;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}