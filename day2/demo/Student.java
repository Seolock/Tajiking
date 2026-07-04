public class Student extends Person {

    private String school;

    // Constructor
    public Student() {
        super();
        school = "TTU";
    }

    // Constructor
    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    // Getter
    public String getSchool() {
        return school;
    }

    // Setter
    public void setSchool(String school) {
        this.school = school;
    }

    // toString
    public String toString() {
        return "Student{" +
                "name='" + getName() + "'" +
                ", age=" + getAge() +
                ", school='" + school + "'" +
                "}\n";
    }

    // implements
    public String printStatus(){
        return "-studying";
    }

}