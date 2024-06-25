package abstraction;
public class Main {
	    public static void main(String[] args) {
	        SavingsAccount savings = new SavingsAccount("SA123", 1000);
	        CheckingAccount checking = new CheckingAccount("CA456", 2000);

	        savings.calculateInterest();
	         checking.calculateInterest();
	    }
	}


