public class Worker extends Person {

    private int salary;

    // Constructor
    public Worker() {
        super();
        salary = 0;
    }

    // Constructor
    public Worker(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    // Getter
    public int getSalary() {
        return salary;
    }

    // Setter
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // toString
    public String toString() {
        return "Worker{" +
                "name='" + getName() + "'" +
                ", age=" + getAge() +
                ", salary=" + salary + "}\n";
    }

    // implements
    public String printStatus(){
        return "-working";
    }

}