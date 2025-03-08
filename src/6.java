import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Enter a number");
        if (x > 10) {
            System.out.println("Greater than 10");
        } else {
            System.out.println("Less than or equal to 10");
        }
    }
}