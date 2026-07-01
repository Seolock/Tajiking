public class Person implements Action {

    private String name;
    private int age;

    // Constructor
    public Person() {
        name = "default";
        age = 0;
    }

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // toString
    public String toString() {
        return "Person{" +
                "name='" + name + "'" +
                ", age=" + age +
                "}";
    }

    // must define what you implements
    public String printStatus(){
        return "-living";
    }

    public void getOld(){
        age++;
    }
    
}