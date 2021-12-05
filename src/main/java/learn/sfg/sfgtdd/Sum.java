package learn.sfg.sfgtdd;

public class Sum implements Expression {
    final Money augend;
    final Money addend;

    public Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    @Override
    public Money reduce(Bank bank, String toCurrency) {
        // todo: reduce both operands to target currency, then add
        final int sumAmount = augend.amount + addend.amount;
        return new Money(sumAmount, toCurrency);
    }
}
