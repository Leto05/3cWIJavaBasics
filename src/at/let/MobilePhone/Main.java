package at.let.MobilePhone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Camera c1 = new Camera(4,"Bild1",".jpeg");
        SimCard sm1 = new SimCard(6923,6881312);
        SDCard sd1 = new SDCard(4);
        Phone p1 = new Phone("black",c1,sd1,sm1);

        System.out.println("Enter name for the Photofile you want to add: ");
        String photoName= scanner.next();

        p1.addPicture(photoName);
        p1.printPhotofiles();
    }
}
