package first.money;

import java.util.Objects;

public class Franc extends Money{

    public Franc(int amount, String currency) {
        super(amount,currency);
    }

    @Override
    public String currency() {
        return currency;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(amount);
    }

    @Override
    public String toString() {
        return "Franc : "+amount;
    }
}
