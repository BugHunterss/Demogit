import java.util.Arrays;

public class Hello {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("Markian");
        int []arr=new int [25];
        for(int i=0;i<arr.length;i++){
            arr[i]=i+1;
        }
        System.out.println(Arrays.toString(arr));
        boolean result=Arrays.equals(arr,arr);
        System.out.println(result);
        System.out.println("new line ");// new line hello world hello world
        System.out.println("hello world");// new line git practice
        System.out.println("new line");
    }
}
