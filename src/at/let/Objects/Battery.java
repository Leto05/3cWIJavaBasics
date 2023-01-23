package at.let.Objects;

public class Battery {
    private int BatteryStatus;

  public Battery(int Batterystatus){
      this.BatteryStatus=Batterystatus;
  }

    public int getBatteryStatus() {
        return BatteryStatus;
    }

    public void setBatteryStatus(int batteryStatus) {
        BatteryStatus = batteryStatus;
    }

}
