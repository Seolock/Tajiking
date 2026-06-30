// Array
public class E06 {
    public static void main(String[] args) {
        
        // int[] arr = {10, 20, 30};

        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);

        // arr[1] = 50;

        // System.out.println(arr[1]);

        // System.out.println(arr.length);

//

        int[] arr = new int[5];

        for(int i=0;i<arr.length;i++){
            arr[i] = i*10;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}