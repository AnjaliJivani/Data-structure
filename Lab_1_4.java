import java.util.Scanner;

public class Lab_1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter a number to find its factorial: ");
        int number = scanner.nextInt();
        
        // Calculate factorial using a loop
        long factorial = 1; // Using long to handle large numbers
        for(int i = 1; i <= number; i++) {
            factorial *= i;
        }
        
        // Output the result
        System.out.println("The factorial of " + number + " is " + factorial);
        
        // Close the scanner
        scanner.close();
    }
}
