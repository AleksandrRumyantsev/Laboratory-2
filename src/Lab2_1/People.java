package Lab2_1;

public class People {
    private String name;

     enum Gender {
         MALE("He"), FEMALE("She");
         private String who;
         Gender (String who){
             this.who=who;
         }
        public String getWho(){
             return who;
        }
     }
    private Gender gender;

    private String departament;

    public People(String name, Gender gender, String departament) {
        this.name = name;
        this.gender = gender;
        this.departament = departament;
    }

    public Gender getGender() {

        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String fio) {
        this.name = fio;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String faculty) {
        this.departament = faculty;
    }

    public void print(){
        System.out.print("This is " + getName() + ". ");
        System.out.print(gender.who+" ");
    }
}
