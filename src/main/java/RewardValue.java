public class RewardValue {
    private final double cashValue;
    public static final double CONVERSION_RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }
    private static int convertToMiles(double cashValue) {
        return (int) (cashValue / CONVERSION_RATE);
    }
    public static double convertToCash(int milesValue) {
        return milesValue * CONVERSION_RATE;
    }
    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }
    public double getCashValue() {
        return cashValue;
    }
    public int getMilesValue() {
        return convertToMiles(this.cashValue);
    }
}
