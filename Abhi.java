import java.util.Scanner;

class Abhi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vowelsCount = 0;
        int consonantsCount = 0;

        String a1 = "Samantha examined the letter and found it contained a hidden message with special characters *&^$@.";
        String a2 = a1.toLowerCase();
        
        // Remove all spaces and special characters from the string, keeping only letters
        String a3 = a2.replaceAll("[^a-z]", "");
        
        System.out.println(a3); // Print the cleaned string
        
        int b = a3.length(); // Length of cleaned string
        System.out.println("Length of cleaned string: " + b);

        // Count vowels and consonants
        for (int i = 0; i < b; i++) {
            char ch = a3.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelsCount++;
            } else {
                consonantsCount++;
            }
        }

        System.out.println("There are " + vowelsCount + " vowels.");
        System.out.println("There are " + consonantsCount + " consonants.");
    }
}
