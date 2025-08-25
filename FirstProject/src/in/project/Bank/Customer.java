package in.project.Bank;

public class Customer {
    public static void main(String[] args) {
        BankAccount acc=new BankAccount("001","Avi");
        acc.depositMoney(100);
        acc.withdrawMoney(200);
        acc.depositMoney(-40);
        acc.withdrawMoney(0);
        acc.withdrawMoney(50);
    }
}
