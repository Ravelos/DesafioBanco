public class CheckingAccount extends BankAccount {

    public CheckingAccount(Client client){
        super(client);
    }

    @Override
    public void printBalance() {
        System.out.println("*=========Account Balance==========*");
        super.printCommonInfos();
    }
}
