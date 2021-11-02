package part6.ObjectsOnAList.MessagingService3;

public class Main {

	public static void main(String[] args) {
		
		MessagingService ms = new MessagingService();
		
		ms.add(new Message("ismail", "deneme"));
		
		System.out.println(ms.getMessages());

	}

}
