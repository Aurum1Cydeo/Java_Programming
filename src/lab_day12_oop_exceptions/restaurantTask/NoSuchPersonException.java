package lab_day12_oop_exceptions.restaurantTask;

public class NoSuchPersonException extends RuntimeException{
    public NoSuchPersonException(String message) {
        super(message);
    }
}
