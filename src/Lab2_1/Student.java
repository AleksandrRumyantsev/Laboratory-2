package Lab2_1;

public class Student extends People{
    enum StageOfStudy {Bachelor, Master, Aspirant};
    private StageOfStudy stageOfStudy;
    private int course;
    private String thesisTitle;

    public Student(String name, Gender gender, String departament, StageOfStudy stageOfStudy, int course) {
        super(name, gender, departament);
        this.stageOfStudy = stageOfStudy;
        this.course = course;
    }

    public Student(String name, Gender gender, String departament, String thesisTitle) {
        super(name, gender, departament);
        this.stageOfStudy = StageOfStudy.Aspirant;
        this.thesisTitle = thesisTitle;
    }

    public String getthesisTitle() {
        return thesisTitle;
    }

    public void setthesisTitle(String thesis) {
        this.thesisTitle = thesis;
    }

    public StageOfStudy getStageOfStudy() {
        return stageOfStudy;
    }

    public void setStageOfStudy(StageOfStudy stageOfStudy) {
        this.stageOfStudy = stageOfStudy;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public void print() {
        super.print();
        System.out.print("stadies in "+ getDepartament()+". ");
        //System.out.println();
        if (getStageOfStudy().name() == "Bachelor" || getStageOfStudy().name() == "Master") {
            System.out.println(getGender().getWho() + " is " + getCourse() + "'th year " + getStageOfStudy() + " student.");
        } else {
            System.out.println(getGender().getWho() + " thesis title is " + getthesisTitle()+".");
        }
    }

}
