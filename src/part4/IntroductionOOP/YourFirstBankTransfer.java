package part4.IntroductionOOP;

public class YourFirstBankTransfer {

    public static void main(String[] args) {
    	
    	Account Matthews = new Account("Matthews account", 1000);
    	
    	Account myAccount = new Account("My account", 0);
    	
    	Matthews.withdrawal(0);
    	
    	myAccount.deposit(100);
    	
    	System.out.println(Matthews.toString());
    	
    	System.out.println(myAccount.toString());
    	
    	
    }
}
