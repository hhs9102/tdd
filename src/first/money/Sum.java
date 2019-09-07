package first.money;

public class Sum implements Expression{
    Expression augend;
    Expression append;

    public Sum(Expression augend, Expression append) {
        this.augend = augend;
        this.append = append;
    }

    public Money reduce(Bank bank, String to) {
        int amout = augend.reduce(bank, to).amount + append.reduce(bank, to).amount;
        return new Money(amout, to);
    }

    @Override
    public Expression plus(Expression append) {
        return new Sum(this, append);
    }

    @Override
    public Expression times(int multiplier) {
        return new Sum(augend.times(multiplier), append.times(multiplier));
    }
}
