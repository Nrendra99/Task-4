package task4.firstQ;

//Custom exception for name containing numbers or special symbols
public class NameNotValidException extends Exception {
public NameNotValidException(String message) {
   super(message);
}
} 