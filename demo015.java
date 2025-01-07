import java.util.Scanner;

public class SwapWithTemp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        // Display original values
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap using a temporary variable
        int temp = a;
        a = b;
        b = temp;

        // Display swapped values
        System.out.println("After swapping: a = " + a + ", b = " + b);

        scanner.close();
    }
}
