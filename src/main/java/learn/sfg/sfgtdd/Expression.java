package learn.sfg.sfgtdd;

public interface Expression {
    Money reduce(Bank bank, String toCurrency);
    Expression plus(Expression addend);
    Expression times(int multiplier);
}
