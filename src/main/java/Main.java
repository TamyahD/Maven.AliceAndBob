import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {
    public static void main(String[] args ){
        isAliceOrBob(getInput());
    }

    public static String getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        return name;
    }

    public static void isAliceOrBob(String n) {
        String user01 = "Bob";
        String user02 = "Alice";
        if (n.equals(user01) | (n.equals(user02))) {
            System.out.println("Hello how are you :)");
        }
        else {
           System.out.println("I don't care how you are...");
        }
    }
}
