package base;

public class PizzaParty {
    private int numPizzas;
    private int numPeople;
    private int totalSlices;

    public PizzaParty(int numPizzas, int numSlices, int numPeople) {
        this.numPizzas = numPizzas;
        this.numPeople = numPeople;
        this.totalSlices = numPizzas * numSlices;
    }

    private int getSlicesPerPerson() {
        return totalSlices / numPeople;
    }

    private int getSlicesLeftover() {
        return totalSlices % numPeople;
    }

    public void displayOutput() {
        System.out.printf("%d people with %d pizzas (%d slices)%n", numPeople, numPizzas, totalSlices);
        System.out.printf("Each person gets %d pieces of pizza.%n", getSlicesPerPerson());
        System.out.printf("There are %d leftover pieces.%n", getSlicesLeftover());
    }
}
