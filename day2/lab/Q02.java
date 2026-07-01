/*

Implement the class Circle and Rectangle.
It needs constructor and getArea() methods.

*/

public class Q02 {
    public static void main(String[] args){
        
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(10,5);

        System.out.println(circle.getArea());
        System.out.println(rectangle.getArea());

    }
}

interface Shape {

    int getArea();
    
}

class Circle implements Shape {
    
    private int radius;

    // your code here

}

class Rectangle implements Shape {
    
    private int width;
    private int height;

    // your code here

}
