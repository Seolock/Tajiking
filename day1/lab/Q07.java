/*

Implement add and delete function so that it works as a dynamic array
that can automatically resize itself, 
while internally using a fixed-size array.

*/

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[0];
        while(true){
            int input = scanner.nextInt();
            if(input==0) break;
            array = add(array, input);
        }
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        scanner.close();
    }

    // returns a new array with +1 length and item x is added to the tail
    static int[] add(int[] array, int x){

        // your code here

    }

}
