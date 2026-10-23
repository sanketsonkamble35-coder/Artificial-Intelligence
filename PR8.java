import java.util.Scanner;
public class PR8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1;
        int high = 100;
        int guess;
        String feedback;
        System.out.println("--------------------------------------------------------------");
        System.out.println("----------Think of a number between 1 and 100.----------------");
        System.out.println("----------The agent will try to guess your number.------------");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Enter higher, lower, or correct.");
        while (low <= high) {
            guess = low + (high - low) / 2;
            System.out.println("\nAgent's guess: " + guess);
            System.out.print("Enter feedback (higher/lower/correct): ");
            feedback = sc.nextLine().trim().toLowerCase();

            if (feedback.equals("correct")) {System.out.println("Hoorey...! Agent found your number!");break;}
            else if (feedback.equals("higher")) {low = guess + 1;}
            else if (feedback.equals("lower")) {high = guess - 1;}
            else {System.out.println("Invalid feedback! Enter higher, lower, or correct.");}
            if (low > high) {System.out.println("Your feedback is inconsistent. Please try again.");break;}
        }
        sc.close();
    }
}

