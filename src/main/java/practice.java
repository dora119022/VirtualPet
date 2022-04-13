
import java.util.Scanner;
public class practice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String myString = scanner.next();
        Double a = scanner.nextDouble();
        int myInt = scanner.nextInt();
        scanner.close();

        System.out.println("String: " + myString);
        System.out.println("Double: " + a);
        System.out.println("int" + myInt);
        }
    }
