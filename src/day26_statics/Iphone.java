package day26_statics;

public class Iphone {
   public static String brand="Apple";//static variable:"Apple" is the brand of all the Iphone objects
   public String model;// instance: different models for iphone objects
   public String color;
   public double price;
   public static String OS="iOS";//static -the same for all iphone objects
   public static String madeIn="China";
   public static boolean hasBattery=true;
   public static boolean isTouchScreen=true;
   public static boolean isExpensiveToFix=true;

    public Iphone(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public void printPhoneInfo(){
      System.out.println("Brand: "+brand);
      System.out.println("Model: "+model);
      System.out.println("Color: "+color);
      System.out.println("Price: "+price);
  }
   public static void printOS(){
       System.out.println("Operating System: "+ OS);
   }
}
/*
Attributes:
brand,model,color,price,OS,madeIn,hasBattery,isTouchScreen,isExpensiveToFix
 */