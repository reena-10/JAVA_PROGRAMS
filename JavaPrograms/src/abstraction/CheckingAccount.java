package abstraction;

	class CheckingAccount extends BankAccount {
	    public CheckingAccount(String accountNumber, double balance) {
	        super(accountNumber, balance);
	    }

	    @Override
	    public void calculateInterest() {
	    	double balance =10000;
	    	System.out.println(balance);
	     }
	}


