package learn.sfg.sfgtdd;

public interface Expression {
    Money reduce(Bank bank, String toCurrency);
}
