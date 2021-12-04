package learn.sfg.sfgtdd;

public class Sum implements Expression {
    final Money augend;
    final Money addend;

    public Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    @Override
    public Money reduce(String toCurrency) {
        final int sumAmount = augend.amount + addend.amount;
        return new Money(sumAmount, toCurrency);
    }
}
