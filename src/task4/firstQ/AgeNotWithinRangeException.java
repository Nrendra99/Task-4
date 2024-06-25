package task4.firstQ;

//Custom exception for age not being within the specified range
public class AgeNotWithinRangeException extends Exception {
public AgeNotWithinRangeException(String message) {
   super(message);
}
}