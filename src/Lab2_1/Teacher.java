package Lab2_1;

public class Teacher extends People{
    enum Degree {MSc, PhD};
    private Degree degree;
    private String speciality;

    public Teacher(String name, Gender gender, String departament, Degree degree, String speciality) {
        super(name, gender, departament);
        this.degree = degree;
        this.speciality = speciality;
    }

    public Degree getDegree() {

        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public void print() {
        super.print();
        System.out.print("teaches in "+getDepartament() +". ");
        //System.out.println();
        System.out.println(getGender().getWho()+" has "+ getDegree()+" degree in "+ getSpeciality());
    }

}
