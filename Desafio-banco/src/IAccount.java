public interface IAccount {
    public void withdraw(double amount);
    public void deposit(double amount);

    public void transfer(double amount, IAccount bankAccount);

    public void printBalance();

}
