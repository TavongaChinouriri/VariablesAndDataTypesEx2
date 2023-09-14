import java.util.Scanner;
//Java program that asks the user to enter his/her name and greets
// them with “Hello <name>, have a good day” text
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you First Name");
        String name = sc.next();
        System.out.println("Hello " + name + ", have a good day.");
    }
}