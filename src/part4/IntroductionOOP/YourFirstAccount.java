package part4.IntroductionOOP;

public class YourFirstAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Account myAccount = new Account("My account", 100.0);
        
        myAccount.deposit(20.0);
        
        System.out.println(myAccount.toString());

	}

}
