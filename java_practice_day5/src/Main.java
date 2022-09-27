public class Main {
    public static void main(String[] args) {
        BankAccount newAccount = new BankAccount("Abhishek",7000);

        newAccount.deposit(1000);
        newAccount.withDraw(200);
        newAccount.deposit(24000);

        System.out.println(newAccount.getOwner());
        System.out.println(newAccount.getBalance());
    }
}
