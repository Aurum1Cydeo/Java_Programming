package lab_day7;

public class Address {

    public String buildingNumber,street,city,state,zip;

    public void setInfo(String buildingNumber, String street, String city, String state, String zip) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    public String toString(){
        return buildingNumber+" "+street+"\n"+city+ ", "+state+" "+zip;

    }
}
