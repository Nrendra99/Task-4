package task4.firstQ;

public class Student { //Student class with attributes roll, name, age, and course
	
	private int roll;
	 private String name;
	 private int age;
	 private String course;

	 // Parameterized constructor to initialize the Student object
	 public Student(int roll, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
	     // Check if age is within the range of 15 to 21
	     if (age < 15 || age > 21) {
	         throw new AgeNotWithinRangeException("Age is not within the range of 15 to 21");
	     }
	     // Check if name contains only alphabets and spaces
	     if (!name.matches("[a-zA-Z\\s]+")) {
	         throw new NameNotValidException("Name contains numbers or special symbols");
	     }
	     // Initialize the attributes if all checks pass
	     this.roll = roll;
	     this.name = name;
	     this.age = age;
	     this.course = course;
	 }


	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", age=" + age + ", course=" + course + "]";
	}


	// Getter for roll
	 public int getRoll() {
	     return roll;
	 }

	 // Getter for name
	 public String getName() {
	     return name;
	 }

	 // Getter for age
	 public int getAge() {
	     return age;
	 }

	 // Getter for course
	 public String getCourse() {
	     return course;
	 }
	}

