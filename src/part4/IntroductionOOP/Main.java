package part4.IntroductionOOP;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
    	/*System.out.println("Whistle Exercise\n");
    	
    	Whistle duckWhistle = new Whistle("Kvaak");
        Whistle roosterWhistle = new Whistle("Peef");
        duckWhistle.sound();
        roosterWhistle.sound();
        duckWhistle.sound();
        
        
        
        System.out.println();
        System.out.println("Door Exercise\n");
        
        Door alexander = new Door();
        alexander.knock();
        alexander.knock();
        
        
        
        System.out.println();
        System.out.println("Product Exercise\n");
        
        Product product = new Product("Banana", 1.1, 13);
        product.printProduct();
        
        
        
        System.out.println();
        System.out.println("Decreasing counter Exercise\n");
        
        DecreasingCounter counter = new DecreasingCounter(100);
        counter.printValue();
        counter.reset();
        counter.printValue();
        counter.decrement();
        counter.printValue();
        
        
        
        
        System.out.println();
        System.out.println("Debt Exercise\n");
        
        Debt mortgage = new Debt(120000.0, 1.01);
        mortgage.printBalance();
        mortgage.waitOneYear();
        mortgage.printBalance();
        int years = 0;
        while (years < 20) {
            mortgage.waitOneYear();
            years = years + 1;
        }
        mortgage.printBalance();
        
        
        
        
        System.out.println();
        System.out.println("Song\n");
        
        Song garden = new Song("In The Garden", 10910);
        System.out.println("The song " + garden.name() + " has a length of " + garden.length() + " seconds.");
        
        
        
        
        System.out.println();
        System.out.println("Film\n");
        
        Film chipmunks = new Film("Alvin and the Chipmunks: The Squeakquel", 0);

        Scanner reader = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = Integer.valueOf(reader.nextLine());

        System.out.println();
        if (age >= chipmunks.ageRating()) {
            System.out.println("You may watch the film " + chipmunks.name());
        } else {
            System.out.println("You may not watch the film " + chipmunks.name());
        }
        
        
        
        System.out.println();
        System.out.println("Gauge\n");
        
        Gauge g = new Gauge();

        while(!g.full()) {
            System.out.println("Not full! Value: " + g.value());
            g.increase();
        }

        System.out.println("Full! Value: " + g.value());
        g.decrease();
        System.out.println("Not full! Value: " + g.value());
        
        
        
        
        System.out.println();
        System.out.println("Agent\n");
        
        Agent bond = new Agent("James", "Bond");
        bond.print();
        
        bond.toString(); // prints nothing
        System.out.println(bond);

        Agent ionic = new Agent("Ionic", "Bond");
        System.out.println(ionic);
        
        
        
        
        System.out.println();
        System.out.println("Multiplier\n");
        
        Multiplier multiplyByThree = new Multiplier(3);

        System.out.println("multiplyByThree.multiply(2): " + multiplyByThree.multiply(2));

        Multiplier multiplyByFour = new Multiplier(4);

        System.out.println("multiplyByFour.multiply(2): " + multiplyByFour.multiply(2));
        System.out.println("multiplyByThree.multiply(1): " + multiplyByThree.multiply(1));
        System.out.println("multiplyByFour.multiply(1): " + multiplyByFour.multiply(1));
        
        
        
        
        
        System.out.println();
        System.out.println("Statistics\n");
        
        Statistics statistics = new Statistics();
        Statistics evenNumber = new Statistics();
        Statistics oddNumber = new Statistics();
        
        System.out.println("Enter numbers:");
		while (true) {
			int number = Integer.valueOf(reader.nextLine());
			if (number == -1) {
				break;
			}
			
			statistics.addNumber(number);
			
			if (number % 2 == 0) {
				
				evenNumber.addNumber(number);
			}
			
			if (number % 2 != 0) {
				
				oddNumber.addNumber(number);
			}
			
		}

        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + evenNumber.sum());
        System.out.println("Sum of odd numbers: " + oddNumber.sum());*/
        
        
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);

        
        paulsCard.eatHeartily();
        System.out.println("Paul: " + paulsCard);
        
        mattsCard.eatAffordably();
        System.out.println("Matt: " + mattsCard);
        
        paulsCard.addMoney(20);
        System.out.println("Paul: " + paulsCard);
        
        mattsCard.eatHeartily();
        System.out.println("Matt: " + mattsCard);
        
        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        System.out.println("Paul: " + paulsCard);
        
        mattsCard.addMoney(50);
        System.out.println("Matt: " + mattsCard);
        
    }
}



