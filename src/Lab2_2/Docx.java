package Lab2_2;

public class Docx extends Files{
    private String format;
    private int pageCount;

    public Docx(String name, int size, String format, int pageCount) {
        super(name, size);
        setFormat(format);
        setPageCount(pageCount);
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        if (format != null) {
            this.format = format;
        }else{
            throw new IllegalArgumentException("incorrect argument");
        }

    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        if (pageCount>=0) {
            this.pageCount = pageCount;
        }else{
            throw new IllegalArgumentException("incorrect argument");
        }
    }

    @Override
    public void print() {
        System.out.printf("| %-20s | %10s | %-55s |%n", getName(), getSize(),getFormat()+", " +getPageCount()+" pages");
    }
}
