package learn.sfg.sfgtdd;

public class Franc {
    private final int amount;

    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    @Override
    public boolean equals(Object obj) {
        Franc other = (Franc) obj;
        return amount == other.amount;
    }
}
