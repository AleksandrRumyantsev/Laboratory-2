package Lab2_2;

public class Video extends Audio{
    private int resolutionW;
    private int resolutionH;

    public Video(String name, int size, String format, String notes, int duration, int resolutionW, int resolutionH) {
        super(name, size, format, notes, duration);
        setResolutionH(resolutionH);
        setResolutionW(resolutionW);
    }

    public int getResolutionH() {
        return resolutionH;
    }

    public void setResolutionH(int resolutionH) {
        if (resolutionH >0) {
            this.resolutionH = resolutionH;
        }else{
            throw new IllegalArgumentException("incorrect argument");
        }
    }

    public int getResolutionW() {
        return resolutionW;
    }

    public void setResolutionW(int resolutionW) {
        if (resolutionW >0) {
            this.resolutionW = resolutionW;
        }else{
            throw new IllegalArgumentException("incorrect argument");
        }
    }
    @Override
    public void print() {
        System.out.printf("| %-20s | %10s | %-55s |%n", getName(), getSize(), getFormat()+", "+getNotes()+", "+durationTime(getDuration())+", "+getResolutionW()+"x"+getResolutionH());
    }
}
