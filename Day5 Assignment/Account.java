/* Create a public class Account with the following members:
private attributes
int id;
String accountType;
double balance;
Add public properties for the all above three fields.
Constructors
• Create an empty parameter constructor. Also create a 3- parameter constructor to set the values for the given
properties.
• Create a method WithDraw which should take amount as input and return a boolean .
public bool Withdraw (double amount) —
This method should deduct the amount from the balance and return true. Before deducting the amount from the
balance ensure there enough balance. If there is no enough balance return
false.
• Add a method GetDetaiIs that returns the details exactly as given in the sample output
public String GetDetaiIs()
• Create a public class Program for the Main method
a) From the Main method create Object for Account and call the GetdetaiIs method and display the details.
b) In the Main method, enter the amount to be withdrawn from user and call Withdraw method bypassing this
amount If WithDraw method returns then display new balance(i.e.after
deduction) */

package Com.Day5Assignment;
import java.util.Scanner;

public class Account {
    private int id;
    private String accountType;
    private double balance;

    public Account() {
        this.id = 0;
        this.accountType = "";
        this.balance = 0.0;
    }

    public Account(int id, String accountType, double balance) {
        this.id = id;
        this.accountType = accountType;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
    public String GetDetails() {
        return "Account Id: " + id + "\n" + "Account Type: " + accountType + "\n" + "Balance: " + balance;
    }

}

public class AccountMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account id");
        int id = sc.nextInt();
        System.out.println("Enter account type");
        String accountType = sc.next();
        System.out.println("Enter account balance");
        double balance = sc.nextDouble();
        System.out.println("Enter amount to withdraw");
        double amountToWithdraw= sc.nextDouble();
        Account account = new Account(id, accountType, balance);
        System.out.println(account.GetDetails());

        boolean withdrawResult = account.withdraw(amountToWithdraw);

        if (withdrawResult){
            System.out.println("New Balance : "+account.getBalance());
        }else{
            System.out.println("Insufficient Balance");
        }
    }
}