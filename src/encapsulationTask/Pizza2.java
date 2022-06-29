package encapsulationTask;


public class Pizza2 {
    private String size;
    private int numberOfCheeseTopping;
    private int numberOfPepperoniTopping;

    public Pizza2(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
       setSize(size);
       setNumberOfCheeseTopping(numberOfCheeseTopping);
       setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (!(size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") || size.equalsIgnoreCase("large"))) {
            System.err.println("NO Pizza available");
            System.exit(1);
        }
        this.size = size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        boolean flag=true;
        if(numberOfCheeseTopping<0){
            flag =false;

        }

        switch(size.toLowerCase()){
            case "small":
                if(numberOfCheeseTopping>3){
                    flag =false;
                break;
                    }
            case"medium":
                if(numberOfCheeseTopping>4){
                    flag =false;
                break;
            }
            case"large":
                if(numberOfCheeseTopping>5){
                    flag =false;
                    break;
                }

        }
        if(flag!=true){
            System.err.println("Number of cheese topping is out of limit");
            System.exit(1);
        }
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        boolean flag=true;
        if(numberOfPepperoniTopping<0){

           flag =false;
        }
        switch(size.toLowerCase()){
            case "small":
                if(numberOfPepperoniTopping>4){
                    flag =false;
                    break;
                }
            case"medium":
                if(numberOfPepperoniTopping>5){
                    flag =false;
                    break;
                }
            case"large":
                if(numberOfPepperoniTopping>6){
                    flag =false;
                    break;
                }
        }
        if(flag!=true){
            System.err.println("Number of pepperoni is out of limit");
            System.exit(1);
        }
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total cost =" + calcCost() +
                '}';
    }

    public int calcCost() {
        int totalCost = 2 * numberOfCheeseTopping + 2 * numberOfPepperoniTopping;
        size = size.toLowerCase();
        switch (size) {
            case "small":
                totalCost += 10;
                break;
            case "medium":
                totalCost += 12;
                break;
            case "large":
                totalCost += 14;
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