package learn.sfg.sfgtdd;

public class Dollar {
    public double amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public void times(double multiplier) {
        amount = amount * multiplier;
    }
}
