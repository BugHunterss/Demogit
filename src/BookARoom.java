import java.util.Scanner;

public class BookARoom {
    public static void main(String[] args) {
        System.out.println("Would your like to book a room?");
        Scanner scanner=new Scanner(System.in);
        String answer=scanner.next();
        if(answer.equalsIgnoreCase("yes")){
            System.out.println("ps call 757-338-****");
        }
        else{
            System.out.println("Ok. See ya l8r;");
        }
    }
}
