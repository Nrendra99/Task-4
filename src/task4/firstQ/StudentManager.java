package task4.firstQ;



public class StudentManager  {
 public static void main(String[] args) {
     try {// Creating a student object with a valid name and age
         
         Student student1 = new Student(1, "Narendra Kumar", 20, "Computer Science");
         System.out.println("Student created: " + student1);
     } catch (AgeNotWithinRangeException| NameNotValidException e) {
         // Print the exception message if any exception is caught
         System.out.println(e.getMessage());
     }
     
     try {// Attempting to create a student object with an invalid name
     
     Student student2 = new Student(2, "John@Doe", 19, "Mathematics");  // This should throw NameNotValidException
     System.out.println("Student created: " + student2);
     } catch (AgeNotWithinRangeException| NameNotValidException e) {
         // Print the exception message if any exception is caught
         System.out.println(e.getMessage());
     }
     
     try { // Attempting to create a student object with an invalid age
    
     Student student3 = new Student(3, "Jane Smith", 22, "Physics");  // This should throw AgeNotWithinRangeException
     System.out.println("Student created: " + student3);
     }catch (AgeNotWithinRangeException| NameNotValidException e) {
         // Print the exception message if any exception is caught
         System.out.println(e.getMessage());
     }
 }


} 