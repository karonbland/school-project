import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}