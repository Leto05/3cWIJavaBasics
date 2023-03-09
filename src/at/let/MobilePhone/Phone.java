package at.let.MobilePhone;

import at.let.Lampe.GlowingObject;

public class Phone {
    private String colour;
    private Camera camera;
    private SDCard sdCard;
    private SimCard simCard;

    public Phone(String colour, Camera camera, SDCard sdCard, SimCard simCard){
        this.colour=colour;
        this.camera=camera;
        this.sdCard=sdCard;
        this.simCard=simCard;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void addPicture(String Name)
    {
        int sum =0;
        for( int i =0; i< sdCard.getPhotoFiles().size();i++)
        {
            sum = sum +sdCard.getPhotoFiles().get(i).getSize();
        }
        if(sum+3 < sdCard.getCapacity())
        {
            PhotoFile p1= new PhotoFile(camera.getResolution(),Name,camera.getExtension());
            this.sdCard.getPhotoFiles().add(p1);
        }
        else {
            System.out.println("Not enough storage");
        }
    }

    public void printPhotofiles()
    {
        for( int i =0; i< sdCard.getPhotoFiles().size();i++)
        {
            System.out.println("Data Names, sizes and extensions listed");
            System.out.print(sdCard.getPhotoFiles().get(i).getName()+".");
            System.out.print(sdCard.getPhotoFiles().get(i).getSize());
            System.out.println(sdCard.getPhotoFiles().get(i).getExtension());
        }
    }

}