import java.util.Scanner;

public class Main{
    public static void main(String args[]){
           
        Scanner sc = new Scanner(System.in);
        //object bank
            BankDetails bank = new BankDetails();
            System.out.println("Enter the name of Acoount holder:");
            bank.accountHolderName = sc.nextLine(); // taking accountholdername as input  
           // Take initial balance
        System.out.println("Enter your account balance:");
        double balance = sc.nextDouble();
        sc.nextLine(); // flush the newline
        bank.setbalance(balance);
        while(true){
            System.out.println("Do you wish to Deposit,Withdraw or Exit?");
            String choice = sc.nextLine();
            if(choice.equalsIgnoreCase("deposit")){
                System.out.println("Enter the amount to deposit:");
                double amount = sc.nextDouble();
                bank.entering(amount);
            }
            else if (choice.equalsIgnoreCase("withdraw")) {
                System.out.println("Enter the amount to withdraw:");
                double amount = sc.nextDouble();
                bank.exiting(amount);
            }else if (choice.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for banking with us!");
                break;
            
            }

            else{
                System.out.println("Invalid command!");
            }
            System.out.println("\nCurrent Balance: $" + bank.getBalance());
        }
          
        // Print final status
        System.out.println("\n--- Final Account Summary ---");
        System.out.println("Account Holder: " + bank.getaccountHolderName());
        System.out.println("Current Balance: $" + bank.getBalance());

        sc.close();  
          

    }
}
 class BankDetails{
    public String accountHolderName;
    private double balance;
    // private double getBalance;
    // public double deposit;
    // public double withdraw;
     

    //Depositing amount in account
    public void entering(double amount){
        if(amount>0){
            balance += amount;
            System.out.println("Deposit Successful...");
        }
        else{
            System.out.println("Error,Deposit caannot be less than 0.");
        }
    }
    public String getaccountHolderName() {
        return accountHolderName;
    }
     public void setAccountHolderName(String name) {
        this.accountHolderName = name;
    }
    // Withdrawing amount from the account
    public void exiting(double amount){
        if(amount>0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdraw Succesful...");
        }
        else{
            System.out.println("Error,cannot withdrawn!");
        }
    }
 // getters and setters for balance
   public void setbalance(double balance){
    this.balance = balance;
   }
   public double getBalance(){
      return this.balance;
   }

}