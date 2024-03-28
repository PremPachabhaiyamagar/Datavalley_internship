import java.util.Scanner;

public class VowelPresenceChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int vowelCount = 0;
        boolean vowelPresent = false;

        inputString = inputString.toLowerCase();

        // Check each character in the string
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelPresent = true;
                vowelCount++;
            }
        }

        if (vowelPresent) {
            System.out.println("Yes, vowels are present in the string.");
            System.out.println("Total number of vowels present: " + vowelCount);
        } else {
            System.out.println("No vowels are present in the string.");
        }

        scanner.close();
    }
}
