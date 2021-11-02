package part5.primitiveReferanceVariables;

public class main {

	public static void main(String[] args) {
		Person lorraine = new Person();
		TimeMachine tardis = new TimeMachine(lorraine);
		tardis.travelInTime(6);
		System.out.println(lorraine.getYear());
	}

}
