/*

Implement a Counter class that can increase, decrease, and reset its value.

Requirements:
- The Counter class should have one field named 'value'.
- Add a constructor that sets the initial value.
- Add an increment() method that increases value by 1.
- Add a decrement() method that decreases value by 1.
- Add a reset() method that sets value back to 0.
- Add a getValue() method.

*/

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter init value: ");
        int init = scanner.nextInt();
        Counter counter = new Counter(init);
        int input = 0;
        do{
            System.out.print("Enter next action(1:increment, 2:decrement, 3:reset, 0:exit): ");
            input = scanner.nextInt();
            if(input==1){
                counter.increment();
            }
            else if(input==2){
                counter.decrement();
            }
            else if(input==3){
                counter.reset();
            }
            System.out.println("Current count: "+counter.getValue());
        }while(input!=0);
    }
}

class Counter {
    
    // your code here

}


/*

program running example:

Enter init value: 5
Enter next action(1:increment, 2:decrement, 3:reset, 0:exit): 1
Current count: 6
Enter next action(1:increment, 2:decrement, 3:reset, 0:exit): 2
Current count: 5
Enter next action(1:increment, 2:decrement, 3:reset, 0:exit): 2
Current count: 4
Enter next action(1:increment, 2:decrement, 3:reset, 0:exit): 3
Current count: 0
Enter next action(1:increment, 2:decrement, 3:reset, 0:exit): 1
Current count: 1
Enter next action(1:increment, 2:decrement, 3:reset, 0:exit): 1
Current count: 2
Enter next action(1:increment, 2:decrement, 3:reset, 0:exit): 2
Current count: 1
Enter next action(1:increment, 2:decrement, 3:reset, 0:exit): 0
Current count: 1

*/