package Lab2_2;

public class Audio extends Files{
    private String format;
    private String notes;
    private int duration;


    public Audio(String name, int size, String format, String notes, int duration) {
        super(name, size);
        setFormat(format);
        setNotes(notes);
        setDuration(duration);
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

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
            if (duration>=0) {
                this.duration = duration;
            }else{
                throw new IllegalArgumentException("incorrect argument");
            }
    }
    public String durationTime(int duration){
        Integer h,m,s;
        String str;
        s = duration%60;
        m=(duration/60)%60;
        h=(duration/60)/60;
        if (h>0){
            str=h.toString()+":"+m.toString()+":"+s.toString();
        }else {str=m.toString()+":"+s.toString();}
            return (str);

    }
    @Override
    public void print() {
        System.out.printf("| %-20s | %10s | %-55s |%n", getName(), getSize(), getFormat()+", "+getNotes()+", "+durationTime(getDuration()) );
    }
}
