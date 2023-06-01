public abstract class BankAccount implements IAccount{

    private static final int DefaultBranch = 1;
    private static int SEQUENCIAL = 1;
    protected int branch;
    protected int number;
    protected double balance;

    protected Client client;

    public BankAccount(Client client){
        this.branch = BankAccount.DefaultBranch;
        this.number = SEQUENCIAL++;
        this.client = client;
    }


    @Override
    public void withdraw(double amount) throws InsufficientFundsException{
        if(this.balance < amount){
            throw new InsufficientFundsException("Balance: " + balance + " Amount: "+ amount);
        }
        this.balance -= amount;
    }

    @Override
    public void deposit(double amount){
        this.balance += amount;
    }

    @Override
    public void transfer(double amount, IAccount destinyAccount) throws InsufficientFundsException{
        if(this.balance < amount){
            throw new InsufficientFundsException("Balance: " + balance + " Amount: "+ amount);
        }
        this.withdraw(amount);
        destinyAccount.deposit(amount);

    }

    public int getBranch() {
        return branch;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return this.balance;
    }

    protected void printCommonInfos() {
        System.out.println(String.format("Titular: %s", this.client.getName()));
        System.out.println(String.format("Agencia: %d", this.branch));
        System.out.println(String.format("Numero: %d", this.number));
        System.out.println(String.format("Saldo: %.2f", this.balance));
    }

}
