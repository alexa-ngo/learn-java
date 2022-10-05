import java.util.Scanner;

public class Adder {
    public static void main(String[] args) {
        // Scanner class
        Scanner scan = new Scanner(System.in);
        
        System.out.println("What is the first number? ");
        int x = scan.nextInt(); 
        
        System.out.println("What is the second number? "); 
        int y = scan.nextInt(); 
        
        int result = x + y;
        
        System.out.println("Your result " + result); 
    }
}