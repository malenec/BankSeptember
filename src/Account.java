public class Account {

    private String name;
    private int balance;

    public Account(String name, int balance) {
        this.name = this.name;
        this.balance = balance;
    }

    public Account(String name)  { // overloaded constructor
        this.name = this.name;
        this.balance = 0;
    }

    public int deposit(int i){
        if(i >= 0)
        {
            balance = balance + i;
        }
        return balance;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }


    public int withdraw(int i) {
        if(i <= balance && i > 0){
            balance = balance - i;
        }
        return balance;
    }
}