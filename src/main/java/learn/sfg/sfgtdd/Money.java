package learn.sfg.sfgtdd;

public abstract class Money {
    protected final int amount;

    public Money(int amount) {
        this.amount = amount;
    }

    public abstract Money times(int multiplier);

    @Override
    public boolean equals(Object obj) {
        if (!getClass().equals(obj.getClass())) {
            return false;
        }
        Money money = (Money) obj;
        return amount == money.amount;
    }

    public static Money dollar(int amount) {
        return new Dollar(amount);
    }

    public static Money franc(int amount) {
        return new Franc(amount);
    }
}
