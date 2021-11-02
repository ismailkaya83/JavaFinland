package part5.removingRepetitiveCode;

public class CounterMain {

	public static void main(String[] args) {
		
		Counter n1 = new Counter();
		Counter n2 = new Counter(5);
		
		System.out.println(n1.value());
		System.out.println(n2.value());
		n2.decrease();
		System.out.println(n2.value());

	}

}
