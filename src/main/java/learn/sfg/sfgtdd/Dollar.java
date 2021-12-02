package learn.sfg.sfgtdd;

public class Dollar {
    public final double amount;

    public Dollar(double amount) {
        this.amount = amount;
    }

    public Dollar times(double multiplier) {
        return new Dollar(amount * multiplier);
    }
}
