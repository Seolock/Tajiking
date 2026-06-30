// String
public class E05 {
    public static void main(String[] args) {
        
        String first = "Hello";
        String second = "Java";

        String result = first + " " + second;

        System.out.println(result);
        System.out.println(result.length());
        System.out.println(result.charAt(0));
        System.out.println(result.charAt(6));
        System.out.println(first.substring(0, 3));
        System.out.println(result.substring(6));
        System.out.println(first.equals(second));
        System.out.println(result.contains(second));
        System.out.println(result.toUpperCase());
        System.out.println(result.toLowerCase());
        
//

        // String str = "  qwer asdf zxcv";
        // System.out.println(str);
        // str = str.trim();
        // System.out.println(str);
        // String[] list = str.split(" ");
        
        // for(int i=0;i<list.length;i++){
        //     System.out.println(list[i]);
        // }

    }
}