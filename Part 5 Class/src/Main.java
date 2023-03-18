import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static final String SWITCH_OFF = "exit";
    public static void main(String[] args) {
        String operation;

        CoffeeMachine coffeeMachine = new CoffeeMachine();

        System.out.println("Write action (buy, fill, take, remaining, exit):");
        operation = scanner.next();
        while (!operation.equals(SWITCH_OFF)) {
            coffeeMachine.executeOperation(operation);
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            operation = scanner.next();
        }
    }
}