package practiceConstructors;



public class Pizza {
    public String size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public  String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total cost =" + calcCost() +
                '}';
    }

    public  int calcCost(){
        int totalCost= 2*numberOfCheeseTopping+2*numberOfPepperoniTopping;
        size=size.toLowerCase();
        switch(size){
            case "small":
            totalCost+=10;
                 break;
            case "medium":
                totalCost+=12;
                break;
            case "large":
                totalCost+=14;
                break;
        }
        return totalCost;
    }

}
/*
sk01:
    Create a custom class named Pizza:
        Attributes:
            size, numberOfCheeseTopping, numberOfPepperoniTopping

            Add a constructor that can set all the fields

        Actions:
            calcCost(): returns the totalCost of the pizza
            toString():returns a String containing the pizza size, quantity of each topping,
             and the pizza cost as calculated by calcCost()

        Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping

 */