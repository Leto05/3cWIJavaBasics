package at.let.MobilePhone;

public class PhotoFile {
    private int size;
    private String name;
    private String extension;

    public PhotoFile(int size, String name, String extension)
    {
        this.size=size;
        this.name=name;
        this.extension=extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public String getExtension() {
        return extension;
    }
}
