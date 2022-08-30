public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World");
        count(5,30);
        make_array(10);
        print("");
        
    }
     public static void count (int start, int end) {
        for (int i = start; i <= end; i++){
            System.out.println(i);
        }
     }
     public static void make_array(int length){
        for(int i = 0; i < length; i++){
            int array[] = new int[length];
            array[i] = i;
            System.out.println(array[i]);
            }
        }
     public static void print(String input){
         System.out.println(input);

     }

}

