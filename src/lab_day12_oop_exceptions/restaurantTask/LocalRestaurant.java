package lab_day12_oop_exceptions.restaurantTask;

public class LocalRestaurant {


    public static void main(String[] args) {


        Employee employee1 = new Server("Emily", 35, 'F', "A01", 55000);

        System.out.println(employee1);
        ((Server) employee1).takeOrder();
        ((Server) employee1).cleanTable();
        System.out.println("-------------------------");

        Employee employee2 = new Chef("Daniel", 42, 'M', "B01", "Head Chef", 85000);

        employee2.work();
        ((Chef) employee2).makeOrder();
        ((Chef) employee2).washDishes();
        System.out.println("--------------------------");

        try {
            ((Server) employee2).takeOrder();
        }catch(ClassCastException e){
           e.printStackTrace();
        }

        System.out.println("-------------------------");

        Server server = new Server("Bella",29,'F',"A02",65000);
        Chef chef = new Chef("Aaron", 45, 'M', "B02", "Head Chef", 95000);

        Restaurant restaurant =new Restaurant("Josh","3467 Jones Branch Dr",5);
        System.out.println(restaurant);

        restaurant.hireServer((Server) employee1);
        restaurant.hireChef((Chef) employee2);

        restaurant.hireServer(server);
        restaurant.hireChef(chef);

        System.out.println(restaurant);
        System.out.println("---------------------------------");

        for (Chef eachChef : restaurant.getChefs()) {
            System.out.println(eachChef);
        }

        for (Server eachServer : restaurant.getServers()) {
            System.out.println(eachServer);
        }

    }
}
