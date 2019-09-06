package first.money;

public  class Money {
    protected int amount;
    protected String currency;

    Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }

    public static Dollar dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    public static Franc franc(int amount) {
        return new Franc(amount, "CHF");
    }

    @Override
    public boolean equals(Object obj) {
        Money money = (Money)obj;
         return money.amount == this.amount
                && currency.equals(money.currency());
    }

     Money times(int multiplier){
        return new Money(amount * multiplier, currency);
     };

    public String currency() {
        return this.currency;
    }

    @Override
    public String toString() {
        return amount + " " + currency;
    }
}
