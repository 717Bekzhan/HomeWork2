package MyExceptions;

public class JsonFileNotFoundException extends RuntimeException{
    public JsonFileNotFoundException(String message) {
        super(message);
    }
}
