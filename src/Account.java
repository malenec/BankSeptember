public class Account {

    private String navn;
    private int saldo;

    public Account(String navn, int saldo) {
        this.navn = navn;
        this.saldo = saldo;
    }

    public Account(String navn)  { // overloaded constructor
        this.navn = navn;
        this.saldo = 0;
    }


    public int deposit(int i){
        if(i >= 0)
        {
            saldo = saldo + i;
        }
        return saldo;
    }

    public String getNavn() {
        return navn;
    }

    public int getSaldo() {
        return saldo;
    }


    public int withdraw(int i) {
        if(i <= saldo && i > 0){
            saldo = saldo - i;
        }
        return saldo;
    }
}