package lab_day7;

public class TestAddressObjects {
    public static void main(String[] args) {

        Address address1=new Address();
        Address address2=new Address();
        Address address3=new Address();




        address1.setInfo("1234A","Federal Way","Fairfax","Va","22091");
        address2.setInfo("76532B","Evergreen","Beaverton","Or","97123");
        address3.setInfo("87653","Cornel rd","Hillsboro","Wa","93124");

        System.out.println(address1);
        System.out.println("----------------------------------");
        System.out.println(address2);
        System.out.println("----------------------------------");
        System.out.println(address3);




    }
}
