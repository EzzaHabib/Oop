class Account {
    double balance;

    public Account() {
        balance = 0;
    }
    public Account(double b) {
        balance = b;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }
    public double getBalance() {
        return balance;
    }
    public static void main(String[] args) {
        Account a1 = new Account();
        System.out.println("Account 1 Balance:" + a1.getBalance());

        Account a2 = new Account(1000);
        a2.deposit(500);
        System.out.println("After deposit: "+a2.getBalance());
        a2.withdraw(300);
        System.out.println("After withdraw: "+a2.getBalance());
    }
}
