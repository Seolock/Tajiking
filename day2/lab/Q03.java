/*

Implements Menu, Food and Drink Class.
It needs constructor, getter, setter, and toString methods.

*/

public class Q03 {
    public static void main(String[] args){

        Menu oshi = new Food();
        Menu cola = new Drink();

        System.out.println(oshi.toString());
        System.out.println(cola.toString());
        
    }
}

class Menu {

    private String name;
    private int price;

    // your code here

}

class Food extends Menu {

    private String meat;

    // your code here

}

class Drink extends Menu {
    
    private int volume;

    // your code here

}
