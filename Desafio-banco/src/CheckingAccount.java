public class CheckingAccount extends BankAccount {

    private static int SEQUENCIAL = 0;
    public CheckingAccount(){
        super.branch = 1;
        super.number = SEQUENCIAL;

    }

}
