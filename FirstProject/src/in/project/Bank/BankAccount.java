package in.project.Bank;

import java.sql.SQLOutput;

class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    public void depositMoney(double money){
        if(money<=0){
            System.out.println("Invalid deposit");
        }else{
            balance+=money;
            System.out.println(money+"Rs deposited");
        }
    }
    public void withdrawMoney(double money){
        if(money<=0){
            System.out.println("Cannot deposit 0 or negative amount");
        }else if(money>balance){
            System.out.println("Cannot withdraw, Amount greater than current balance");
        }else{
            balance-=money;
            System.out.printf("Money withdrwan is %f and Balance is %f",money,balance);
        }
    }
}
