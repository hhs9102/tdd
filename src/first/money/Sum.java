package first.money;

public class Sum implements Expression{
    Money augend;
    Money append;

    public Sum(Money augend, Money append) {
        this.augend = augend;
        this.append = append;
    }

    public Money reduce(String to) {
        int amout = augend.amount + append.amount;
        return new Money(amout, to);
    }
}
