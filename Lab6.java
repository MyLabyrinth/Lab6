import java.util.Scanner;
import java.util.Random;

public class Lab6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        /*
         * ====================================
         *        IF THIS THEN THAT
         * ====================================
         */
        
        // Task 1: Pass/Fail
        System.out.println("=== Task 1: Pass/Fail ===");
        System.out.print("Grade: ");
        int grade1 = scanner.nextInt();
        
        // TODO: If grade is 60 or higher, print "You shall pass!"
        // Otherwise, print "You shall not pass!"
        
        
        System.out.println(); // Empty line for spacing
        
        // Task 2: Make the Grade
        System.out.println("=== Task 2: Make the Grade ===");
        System.out.print("Grade: ");
        int grade2 = scanner.nextInt();
        
        // TODO: Print letter grade based on score
        // 90+ = A, 80+ = B, 70+ = C, 60+ = D, else = F
        
        
        System.out.println(); // Empty line for spacing
        
        // Task 3: Hello, Professor
        System.out.println("=== Task 3: Hello, Professor ===");
        System.out.print("Name: ");
        scanner.nextLine(); // Clear buffer
        String name3 = scanner.nextLine();
        
        // TODO: If name is "Sarah", print "Hello Professor!"
        // Otherwise, print "Hello Student!"
        
        
        System.out.println(); // Empty line for spacing
        
        // Task 4: Sorting Hat
        System.out.println("=== Task 4: Sorting Hat ===");
        System.out.print("Name: ");
        String name4 = scanner.nextLine();
        
        // TODO: Based on the name, assign to houses:
        // "Harry Potter" -> Gryffindor
        // "Draco Malfoy" -> Slytherin
        // "Luna Lovegood" -> Ravenclaw
        // Anyone else -> Hufflepuff
        // Print: "[name] is in [house]!"
        
        
        System.out.println(); // Empty line for spacing
        
        // Task 5: Random Sorting Hat
        System.out.println("=== Task 5: Random Sorting Hat ===");
        System.out.print("Name: ");
        String name5 = scanner.nextLine();
        
        // TODO: Generate random number 0-3
        // 0 = Gryffindor, 1 = Slytherin, 2 = Hufflepuff, 3 = Ravenclaw
        // Print: "[name] is in [house]"
        // Hint: Use random.nextInt(4) to get a number from 0-3
        
        
        System.out.println(); // Empty line for spacing
        
        // Task 6: Weighted Sorting Hat
        System.out.println("=== Task 6: Weighted Sorting Hat ===");
        System.out.print("Name: ");
        String name6 = scanner.nextLine();
        
        // TODO: Generate random number 1-100
        // 1-40: Gryffindor, 41-70: Slytherin, 71-90: Hufflepuff, 91-100: Ravenclaw
        // Print: "[name] is in [house]"
        // Hint: Use random.nextInt(100) + 1 to get a number from 1-100
        
        
        System.out.println(); // Empty line for spacing
        
        /*
         * ====================================
         *          LOOP-THE-LOOP
         * ====================================
         */
        
        // Task 7: It's a secret
        System.out.println("=== Task 7: It's a secret ===");
        String password = "secret"; // The correct password
        String userInput;
        
        // TODO: Keep asking "What's the password? " until they enter "secret"
        // Print "Wrong!" for incorrect attempts
        // Print "Correct!" when they get it right
        // Hint: Use a do-while loop or while loop
        
        
        System.out.println(); // Empty line for spacing
        
        // Task 8: The Final Countdown
        System.out.println("=== Task 8: The Final Countdown ===");
        System.out.print("Number: ");
        int countdown = scanner.nextInt();
        
        // TODO: Count down from the number to 1
        // Then print "We have liftoff!"
        // Hint: Use a for loop starting from countdown and going down to 1
        
        
        System.out.println(); // Empty line for spacing
        
        // Task 9: Characters
        System.out.println("=== Task 9: Characters ===");
        System.out.print("Name: ");
        scanner.nextLine(); // Clear buffer
        String name9 = scanner.nextLine();
        
        // TODO: Use a loop to print each character on a separate line
        // Hint: Use name9.length() and name9.charAt(i)
        
        
        System.out.println(); // Empty line for spacing
        
        // Task 10: esreveR
        System.out.println("=== Task 10: esreveR ===");
        System.out.print("Name: ");
        String name10 = scanner.nextLine();
        
        // TODO: Print the name in reverse, one character per line
        // Hint: Loop backwards through the string
        
        
        System.out.println(); // Empty line for spacing
        
        // Task 11: Step Counter
        System.out.println("=== Task 11: Step Counter ===");
        System.out.print("Count: ");
        int count = scanner.nextInt();
        
        // TODO: Print numbers 1 to count
        // Add spaces before each number (0 spaces for 1, 1 space for 2, etc.)
        // Hint: Use nested loops or String.repeat() for spaces
        
        
        scanner.close();
    }
}