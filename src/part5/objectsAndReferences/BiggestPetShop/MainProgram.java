package part5.objectsAndReferences.BiggestPetShop;

import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
    	
    	Pet lucy = new Pet("Lucy", "golden retriever");
    	Person leo = new Person("Leo", lucy);

    	System.out.println(leo);
    }
}