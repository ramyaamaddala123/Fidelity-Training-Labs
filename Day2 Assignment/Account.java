/* Create an account class with accno, name, balance as data members and deposit, withdraw and
check account balances as their methods. Based on the customers request, it needs to perform
deposit, withdraw and balance checking and displays the accno, name, balance as the output. */
package Com.Day2Assignment;

public class Account{
    int accNo;
    String name;
    double balance;

    public Account(int accNo, String name, double balance){
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited amount : $" +amount);
        }
        else{
            System.out.println("Invalid amount");
        }
    }
    public void withdrawn(double amount){
        if(amount > 0  && amount <= balance){
            balance -= amount;
            System.out.println("Withdrawn amount : $" +amount);
        }
        else{
            System.out.println("Invalid withdrawn amount");
        }
    }
    public void balanceCheck() {
        System.out.println("Account Number : " + accNo);
        System.out.println("Account Name : " + name);
        System.out.println("Account Balance : " + balance);
    }
}

public class AccountMain{
    public static void main(String[] args){
        Account acc1 = new Account(1, "Ramya", 1000.0);
        //Checking the balance
        acc1.balanceCheck();
        System.out.println();
        //Depositing the money
        acc1.deposit(500.0);
        acc1.balanceCheck();
        System.out.println();
        //Withdraw the money
        acc1.withdrawn(300.0);
        acc1.balanceCheck();
        System.out.println();
    }
}