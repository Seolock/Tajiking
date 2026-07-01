public class Main { 
    public static void main(String[] args){
        
        Person person = new Person("Makr",30);
        System.out.println(person.toString());

        Student student = new Student("Luke",25,"Handong");
        // Person student = new Student("Luke",25,"Handong");
        System.out.println(student.toString());

        Worker worker = new Worker("Luke",25,30000);
        // Person worker = new Worker("Luke",25,30000);
        System.out.println(worker.toString());

        System.out.println(worker.printStatus());

        worker.getOld();

        System.out.println(worker.toString());

    }
}