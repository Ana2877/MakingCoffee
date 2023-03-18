import java.util.Scanner;

public class CoffeeMachine {
    static Scanner scanner = new Scanner(System.in);
    static int money = 550;
    static int water = 400;
    static int milk = 540;
    static int beans = 120;
    static int cups = 9;

    static public void buyCoffee () {
        String coffeeType;

        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        coffeeType = scanner.next();

        switch (coffeeType) {
            case "1":
                Espresso espresso = new Espresso();
                if (espresso.canMake())
                    espresso.make();
                break;
            case "2":
                Latte latte = new Latte();
                if (latte.canMake())
                    latte.make();
                break;
            case "3":
                Cappuccino cappuccino = new Cappuccino();
                if (cappuccino.canMake())
                    cappuccino.make();
                break;
            case "back":
                break;
        }
    }

    static public void fillCoffeeMachine () {

        System.out.println("Write how many ml of water you want to add:");
        water += scanner.nextInt();

        System.out.println("Write how many ml of milk you want to add:");
        milk += scanner.nextInt();

        System.out.println("Write how many grams of coffee beans you want to add:");
        beans += scanner.nextInt();

        System.out.println("Write how many disposable cups you want to add:");
        cups += scanner.nextInt();
    }

    static public void takeOutTheMoney () {
        System.out.printf("I gave you $%d\n\n", money);
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

    static public void executeOperation(String operation) {
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
            case "remaining":
                printMachineState();
                break;
        }
    }
}
