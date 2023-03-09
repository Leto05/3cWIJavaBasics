package at.let.MobilePhone;

public class Camera {
    private int resolution;
    private String pictureName;
    private String extension;

    public Camera(int resolution, String pictureName, String extension)
    {
        this.resolution=resolution;
        this.pictureName=pictureName;
        this.extension=extension;
    }

    public int getResolution() {
        return resolution;
    }

    public String getExtension() {
        return extension;
    }

    public String getPictureName() {
        return pictureName;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void setPictureName(String pictureName) {
        this.pictureName = pictureName;
    }

    public PhotoFile shootPicture(int resolution, String pictureName, String extension)
    {
        resolution=this.resolution;
        pictureName=this.pictureName;
        extension= this.extension;
        PhotoFile p1= new PhotoFile(resolution,pictureName,extension);
        return p1;
    }
}
