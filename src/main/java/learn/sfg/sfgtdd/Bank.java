package learn.sfg.sfgtdd;

import java.util.HashMap;
import java.util.Map;

public class Bank {

    private final Map<Pair, Integer> rateMap = new HashMap<>();

    public Money reduce(Expression source, String toCurrency) {
        return source.reduce(this, toCurrency);
    }

    public void addRate(String from, String to, int fromToRate) {
        Pair pair = new Pair(from, to);
        rateMap.put(pair, fromToRate);
    }

    public int rate(String fromCurrency, String toCurrency) {
        if (fromCurrency.equals(toCurrency)) {
            return 1;
        }
        return rateMap.get(new Pair(fromCurrency, toCurrency));
    }
}
