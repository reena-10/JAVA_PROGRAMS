package abstraction;

class SavingsAccount extends BankAccount {
 public SavingsAccount(String accountNumber, double balance) {
     super(accountNumber, balance);
 }
 

 @Override
 public void calculateInterest() {
     double interestRate = 0.03;
     System.out.println(interestRate);
   }




}
