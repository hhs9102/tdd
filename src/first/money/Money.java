package first.money;

public  class Money implements Expression {
    protected int amount;
    protected String currency;

    Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }

    public static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    @Override
    public boolean equals(Object obj) {
        Money money = (Money)obj;
         return money.amount == this.amount
                && currency.equals(money.currency());
    }

    public Expression times(int multiplier){
        return new Money(amount * multiplier, currency);
     };

    public String currency() {
        return this.currency;
    }

    @Override
    public String toString() {
        return amount + " " + currency;
    }

    public Expression plus(Expression append) {
        return new Sum(this, append);
    }

    public Money reduce(Bank bank, String to){
        int rate = bank.rate(currency, to);
        return new Money(amount/rate, to);
    }
}
