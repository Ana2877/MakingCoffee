import java.util.Scanner;

import static java.lang.Math.min;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int money = 550;
    static int water = 400;
    static int milk = 540;
    static int beans = 120;
    static int cups = 9;

    public static void makeEspresso() {
        water -= 250;
        beans -= 16;
        money += 4;
        cups -= 1;
    }

    public static void makeLatte() {
        water -= 350;
        milk -= 75;
        beans -= 20;
        money += 7;
        cups -= 1;
    }

    public static void makeCappuccino() {
        water -= 200;
        milk -= 100;
        beans -= 12;
        money += 6;
        cups -= 1;
    }

    static public void buyCoffee () {
        int coffeeType;

        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        coffeeType = scanner.nextInt();

        switch (coffeeType) {
            case 1:
                makeEspresso();
                break;
            case 2:
                makeLatte();
                break;
            case 3:
                makeCappuccino();
                break;
        }
    }

    static public void fillCoffeeMachine () {
        int quantityToAdd;

        System.out.println("Write how many ml of water you want to add:");
        quantityToAdd = scanner.nextInt();
        water += quantityToAdd;

        System.out.println("Write how many ml of milk you want to add:");
        quantityToAdd = scanner.nextInt();
        milk += quantityToAdd;

        System.out.println("Write how many grams of coffee beans you want to add:");
        quantityToAdd = scanner.nextInt();
        beans += quantityToAdd;

        System.out.println("Write how many disposable cups you want to add:");
        quantityToAdd = scanner.nextInt();
        cups += quantityToAdd;
    }

    static public void takeOutTheMoney () {
        System.out.printf("I gave you $%d\n", money);
        money = 0;
    }

    static public void printMachineState () {
        System.out.println("\nThe coffee machine has:");
        System.out.printf("%d ml of water\n", water);
        System.out.printf("%d ml of milk\n", milk);
        System.out.printf("%d g of coffee beans\n", beans);
        System.out.printf("%d disposable cups\n", cups);
        System.out.printf("$%d of money\n\n", money);
    }
    public static void main(String[] args) {
        String operation;

        printMachineState();

        System.out.println("Write action (buy, fill, take):");
        operation = scanner.next();
        switch (operation) {
            case "buy":
                buyCoffee();
                break;
            case "fill":
                fillCoffeeMachine();
                break;
            case "take":
                takeOutTheMoney();
                break;
        }

        printMachineState();
    }
}