package learn.sfg.sfgtdd;

public class Dollar extends Money {

    public Dollar(int amount) {
        super(amount);
    }

    @Override
    public Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}
