package at.let.MobilePhone;
import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int capacity;
    private List<PhotoFile> photoFiles;

    public SDCard(int capacity)
    {
        this.capacity=capacity;
        this.photoFiles= new ArrayList<>();
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<PhotoFile> getPhotoFiles() {
        return photoFiles;
    }

    public void setPhotoFiles(List<PhotoFile> photoFiles) {
        this.photoFiles = photoFiles;
    }
}
