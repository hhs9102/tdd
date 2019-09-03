package first.money;

import java.util.Objects;

public class Dollar extends Money{

    public Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier){
        return new Dollar(this.amount * multiplier);
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
