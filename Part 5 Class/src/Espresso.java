public class Espresso extends Coffee{
    final int WATER_NEEDED = 250;
    final int BEANS_NEEDED = 16;
    final int MONEY_NEEDED = 4;
    final int CUPS_NEEDED = 1;
    final int MILK_NEEDED = 0;

    public void make() {
        super.make(WATER_NEEDED, BEANS_NEEDED, MONEY_NEEDED, CUPS_NEEDED, MILK_NEEDED);
    }

    public boolean canMake() {
        return super.canMake(WATER_NEEDED, BEANS_NEEDED, MONEY_NEEDED, CUPS_NEEDED, MILK_NEEDED);
    }
}
