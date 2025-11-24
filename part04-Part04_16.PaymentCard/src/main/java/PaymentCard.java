public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        // write code here
        this.balance = openingBalance;
    }

    public String toString() {
        // write code here
        return "The card has a balance of "+ balance +" euros";
    }

    public void eatAffordably() {
    // write code here
        if(balance - 2.60 >= 0) balance-=2.60;
    }

    public void eatHeartily() {
        // write code here
        if (balance - 4.60 >= 0) balance-=4.60;
    }

    public void addMoney(double amount) {
        // write code here
        if (amount > 0) {
            if (balance + amount <= 150){
                balance+=amount;
            }else{
                balance = 150;
            }
        }
}
}
