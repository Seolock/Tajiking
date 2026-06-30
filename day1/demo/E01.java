// IO
import java.util.Scanner;

public class E01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int age = sc.nextInt();

        System.out.println("name: " + name);
        System.out.println("age: " + age);

//

        // int a = sc.nextInt();
        // double b = sc.nextDouble();
        // String c = sc.next();

        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);

//

        // System.out.print("Hello");    // without \n
        // System.out.println("Hello");  // with \n
        // System.out.printf("hello %d %.2f", 10, 3.14159); // with format

        sc.close();
    }
}


/*
Scanner.nextInt();     // int
Scanner.nextLong();    // long
Scanner.nextDouble();  // double
Scanner.next();        // String before white space
Scanner.nextLine();    // whole line
*/