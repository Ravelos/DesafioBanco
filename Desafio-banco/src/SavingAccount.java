public class SavingAccount extends BankAccount{

    public SavingAccount(Client client){
        super(client);
    }

    @Override
    public void printBalance() {
        System.out.println("*=========Account Balance==========*");
        super.printCommonInfos();
    }
}
