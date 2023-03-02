package at.let.inheritance;

public class Main {
    public static void main(String[] args)
    {
        Truck t1= new Truck("Mercedes","green","A222",100,"smallTrailer");
        RaceCar r1= new RaceCar("Ferrari","red","F123",100,"wing1");

        System.out.println(t1.getColour()+t1.getTrailer());
        System.out.println(r1.getWing());
    }
}
