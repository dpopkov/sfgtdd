package learn.sfg.sfgtdd;

public class Sum implements Expression {
    final Expression augend;
    final Expression addend;

    public Sum(Expression augend, Expression addend) {
        this.augend = augend;
        this.addend = addend;
    }

    @Override
    public Money reduce(Bank bank, String toCurrency) {
        final int sumAmount = augend.reduce(bank, toCurrency).amount + addend.reduce(bank, toCurrency).amount;
        return new Money(sumAmount, toCurrency);
    }

    @Override
    public Expression plus(Expression addend) {
        return null;
    }
}
