// Function(Method)
public class E07 {

    static int add(int a, int b) {
        return a + b;
    }

    static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    static String greet(String name) {
        return "Hello " + name + "!";
    }

    static int square(int x) {
        return x * x;
    }

    static int sumOfSquares(int a, int b) {
        return square(a) + square(b);
    }

    public static void main(String[] args) {
        
        System.out.println(add(3, 5));
        System.out.println(max(10, 20));
        System.out.println(greet("Mark"));
        System.out.println(sumOfSquares(3,4));

    }
}