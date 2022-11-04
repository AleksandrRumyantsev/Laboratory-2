package Lab2_2;

public class Files {
    private String name;
    private int size;

    public Files(String name, int size) {
        setName(name);
        setSize(size);
    }

    public String getName() {
            return name;
    }

    public void setName(String name) {
        if (name != null) {
        this.name = name;
        } else {
            throw new IllegalArgumentException("incorrect argument");
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if (size>0) {
            this.size = size;
        }else {
            throw new IllegalArgumentException("incorrect argument");
        }
    }

    public void print(){
        System.out.printf("| %-20s | %10s | %-55s |%n", name,size);
    }
}
