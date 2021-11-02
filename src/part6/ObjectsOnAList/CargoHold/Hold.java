package part6.ObjectsOnAList.CargoHold;

import java.util.ArrayList;

/*
 * The class Hold has to ensure that the total weight of the suitcases it contains does not exceed 
 * the maximum weight. Should the maximum weight be exceeded due to the addition of new luggage, 
 * the addSuitcase method should not add the new suitcase.*/

public class Hold {
 
    private ArrayList<Suitcase> suitcases;
    private int maximumWeight;
 
    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
    }
 
    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() > maximumWeight) {
            return;
        }
 
        this.suitcases.add(suitcase);
    }
 
    public int totalWeight() {
        int sum = 0;
        int index = 0;
        while (index < this.suitcases.size()) {
            sum += this.suitcases.get(index).totalWeight();
            index++;
        }
        return sum;
    }
 
    public void printItems() {
        int index = 0;
        while (index < this.suitcases.size()) {
            this.suitcases.get(index).printItems();
            index++;
        }
    }
 
    @Override
    public String toString() {
        if (this.suitcases.isEmpty()) {
            return "no suitcases (0 kg)";
        }
 
        if (this.suitcases.size() == 1) {
            return "1 suitcase (" + this.totalWeight() + " kg)";
        }
 
        return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
}
