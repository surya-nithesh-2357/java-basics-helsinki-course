public class Debt {
    private double interest;
    private double balance;
    public Debt(double openingBalance, double interestRate){
        this.balance = openingBalance;
        this.interest = interestRate;
    }
    public void waitOneYear(){
        balance = balance*interest;
    }
    public void printBalance(){
        System.out.println(balance);
    }
}
