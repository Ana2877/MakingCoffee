public class Coffee extends CoffeeMachine {

    public void make(int waterNeeded, int beansNeeded, int moneyNeeded,
                     int cupsNeeded, int milkNeeded) {
        System.out.println("I have enough resources, making you a coffee!\n");
        water -= waterNeeded;
        beans -= beansNeeded;
        money += moneyNeeded;
        cups -= cupsNeeded;
        milk -= milkNeeded;
    }

    public boolean canMake(int waterNeeded, int beansNeeded, int moneyNeeded,
                     int cupsNeeded, int milkNeeded) {
        if (water - waterNeeded < 0) {
            System.out.println("Sorry, not enough water!");
            return false;
        } if (beans - beansNeeded < 0) {
            System.out.println("Sorry, not enough coffee beans!");
            return false;
        } if (money - moneyNeeded < 0) {
            System.out.println("Sorry, not enough money!");
            return false;
        } if (cups - cupsNeeded < 0) {
            System.out.println("Sorry, not enough cups!");
            return false;
        } if (milk - milkNeeded < 0) {
            System.out.println("Sorry, not enough milk!");
            return false;
        }
        return true;
    }
}
