package first.money;

import java.util.Objects;

public class Franc extends Money{

    public Franc(int amount) {
        this.amount = amount;
    }

    Money times(int multiplier){
        return new Franc(this.amount * multiplier);
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
