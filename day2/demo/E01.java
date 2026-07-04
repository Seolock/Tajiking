public class E01 { 
    public static void main(String[] args){
        
        Person person = new Person("Makr",30);
        System.out.println(person);

        Student student = new Student("Luke",25,"Handong");
        System.out.println(student);

        Worker worker = new Worker("Luke",25,30000);
        System.out.println(worker);

        System.out.println(person.printStatus());
        System.out.println(student.printStatus());
        System.out.println(worker.printStatus());

        worker.getOld();
        System.out.println(worker);

    }
}