package first.money;

import java.util.Objects;

public class Dollar extends Money{

    public Dollar(int amount, String currency) {
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
        return "Dollar : "+amount;
    }
}
