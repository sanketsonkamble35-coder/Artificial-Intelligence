import java.util.Scanner;
public class PR7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        System.out.println("----------------Lets Chat---------------------");
        System.out.println("Chatbot: Hello! How can I help you?");
        System.out.println("Type 'bye' or 'exit' to exit.");
        while (true) {
            System.out.print("You: ");
            input = sc.nextLine().toLowerCase().trim();
            if (input.equals("bye") || input.equals("exit")) {
                System.out.println("Chatbot: Goodbye! Have a nice day.");
                break;}

            else if (input.contains("hello") ||
                     input.contains("hi") ||
                     input.contains("hey")) {
                System.out.println("Chatbot: Hello! How are you?");}

            else if (input.startsWith("my name is ")) {
                String name = input.substring(11);
                System.out.println("Chatbot: Nice to meet you, " + name + "!");}

            else if (input.startsWith("i am ")) {
                String feeling = input.substring(5);
                System.out.println("Chatbot: Why are you " + feeling + "?");}

            else if (input.startsWith("i like ")) {
                String interest = input.substring(7);
                System.out.println("Chatbot: Why do you like " + interest + "?");}

            else if (input.contains("how are you")) {
                System.out.println("Chatbot: I am fine! Thank you for asking.");}

            else if (input.contains("sad") ||
                    input.contains("unhappy")) {
                System.out.println("Chatbot: I am sorry to hear that. What happened?");}
            else {System.out.println("Chatbot: Tell me more about that.");}
        }
        sc.close();
    }
}
