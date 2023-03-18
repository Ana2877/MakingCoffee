public class Latte extends Coffee{
    final int WATER_NEEDED = 350;
    final int BEANS_NEEDED = 20;
    final int MONEY_NEEDED = 7;
    final int CUPS_NEEDED = 1;
    final int MILK_NEEDED = 75;

    public void make() {
        super.make(WATER_NEEDED, BEANS_NEEDED, MONEY_NEEDED, CUPS_NEEDED, MILK_NEEDED);
    }

    public boolean canMake() {
        return super.canMake(WATER_NEEDED, BEANS_NEEDED, MONEY_NEEDED, CUPS_NEEDED, MILK_NEEDED);
    }
}
