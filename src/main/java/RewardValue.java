import java.text.NumberFormat;
import java.util.Locale;

public class RewardValue {

    private double cashValue;
    private int milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int)Math.round(cashValue / 0.0035);
    }

    public RewardValue(int milesValue){
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

    @Override
    public String toString() {
        return "Your Cash Value: " + NumberFormat.getCurrencyInstance(Locale.US).format(cashValue) + "/n" +
                "Your Miles Value: " + NumberFormat.getNumberInstance(Locale.US).format(milesValue);
    }
}
