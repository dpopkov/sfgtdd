package learn.sfg.sfgtdd;

public abstract class Money {
    protected final int amount;

    public Money(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object obj) {
        if (!getClass().equals(obj.getClass())) {
            return false;
        }
        Money money = (Money) obj;
        return amount == money.amount;
    }
}