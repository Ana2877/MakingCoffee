public class Cappuccino extends Coffee{
    final int WATER_NEEDED = 200;
    final int BEANS_NEEDED = 12;
    final int MONEY_NEEDED = 6;
    final int CUPS_NEEDED = 1;
    final int MILK_NEEDED = 100;

    public void make() {
        super.make(WATER_NEEDED, BEANS_NEEDED, MONEY_NEEDED, CUPS_NEEDED, MILK_NEEDED);
    }

    public boolean canMake() {
        return super.canMake(WATER_NEEDED, BEANS_NEEDED, MONEY_NEEDED, CUPS_NEEDED, MILK_NEEDED);
    }
}
