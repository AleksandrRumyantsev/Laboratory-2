package Lab2_2;

public class Image extends Files{
    private String format;
    private int width;
    private  int height;

    public Image(String name, int size, String format, int width, int height) {
        super(name, size);
        setFormat(format);
        setWidth(width);
        setHeight(height);
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        if (format!=null) {
            this.format = format;
        }else{
            throw new IllegalArgumentException("incorrect argument");
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width >=0){
            this.width = width;
        }else{
            throw new IllegalArgumentException("incorrect argument");
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height>=0) {
            this.height = height;
        }else{
            throw new IllegalArgumentException("incorrect argument");
        }
    }
    @Override
    public void print() {
        System.out.printf("| %-20s | %10s | %-55s |%n", this.getName(), this.getSize(),this.getFormat()+", "+ this.getWidth()+"x"+this.getHeight());
    }
}
