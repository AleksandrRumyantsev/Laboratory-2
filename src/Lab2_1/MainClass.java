package Lab2_1;

public class MainClass {
    public static void printAll(People [] people){
        for (int i=0; i<people.length; i++){
            people[i].print();
        }
    }
    public static void main(String[] args) {
        People[] peoples = new People[6];
        peoples[0]  = new Teacher("Ronald Turner", People.Gender.MALE, "Computer science", Teacher.Degree.PhD, "Programming paradigms");
        peoples[1] = new Teacher("Ruth Hollings", People.Gender.MALE, "Jurisprudence", Teacher.Degree.MSc,"Domestic arbitration" );
        peoples[2] = new Student("Leo Wilkinson", People.Gender.MALE, "Computer science", Student.StageOfStudy.Bachelor, 3);
        peoples[3] = new Student("Anna Cunningham", People.Gender.FEMALE, "World economy", Student.StageOfStudy.Bachelor,1);
        peoples[4] = new Student("Jill Lundqvist", People.Gender.FEMALE, "Jurisprudence", Student.StageOfStudy.Master, 1);
        peoples[5] = new Student("Ronald Correa", People.Gender.MALE, "Computer science", "Design of a functional programming language.");

        printAll(peoples);
    }
}
