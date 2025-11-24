
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition){
        int tot_cents = this.cents+addition.cents;
        int tot_euros = this.euros+addition.euros;
        Money totMoney = new Money(tot_euros, tot_cents);
        return totMoney;
    }

    public boolean lessThan(Money compared){
        if (this.euros > compared.euros){
            return false;
        }else if (this.euros == compared.euros && this.cents > compared.cents){
            return false;
        }else{
            return true;
        }
    }

    public Money minus(Money decreaser){
        int tot_cents =0;
        int tot_euros =0;
        if (!this.lessThan(decreaser)){
            tot_euros = (this.euros-decreaser.euros);
            if (this.cents-decreaser.cents >= 0){
                tot_cents = this.cents - decreaser.cents;
            }else{
                tot_cents = 100+this.cents - decreaser.cents;
                tot_euros--;
            }
            Money totMoney = new Money(tot_euros, tot_cents);
            return totMoney;
        }
        return new Money(tot_euros, tot_cents);
    }

}
