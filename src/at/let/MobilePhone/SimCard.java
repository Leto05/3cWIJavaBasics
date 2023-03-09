package at.let.MobilePhone;

public class SimCard {
    private int ID;
    private int phoneNumber;

    public SimCard(int ID, int phoneNumber)
    {
        this.ID=ID;
        this.phoneNumber=phoneNumber;
    }

    public int getID() {
        return ID;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
