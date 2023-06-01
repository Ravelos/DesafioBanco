public class Main {
    public static void main(String[] args) {

        System.out.println("Hello Welcome to  Campinas Bank");


//        Create the client
        Client oswaldo = new Client();
        oswaldo.setName("Oswaldo Ravelo");

//        Create the bank account
        BankAccount checkingAccount = new CheckingAccount(oswaldo);
        BankAccount savingAccount = new SavingAccount(oswaldo);

        checkingAccount.deposit(5000.98);
        checkingAccount.transfer(250.78, savingAccount);
        System.out.println("Checking account balance "+ checkingAccount.getBalance());
        System.out.println("Saving account balance "+ savingAccount.getBalance());

        checkingAccount.withdraw(10000);

    }
}