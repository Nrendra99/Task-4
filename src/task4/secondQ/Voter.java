package task4.secondQ;

public class Voter { //Voter class with attributes voterId, name, and age
	 
	private int voterId;
	 private String name;
	 private int age;

	 // Parameterized constructor to initialize the Voter object
	 public Voter(int voterId, String name, int age) throws InvalidAgeForVoterException {
	     // Check if age is less than 18
	     if (age < 18) {
	         throw new InvalidAgeForVoterException("Invalid age for voter");
	     }
	     // Initialize the attributes if age is valid
	     this.voterId = voterId;
	     this.name = name;
	     this.age = age;
	 }

	 // Getter for voterId
	 public int getVoterId() {
	     return voterId;
	 }

	 // Getter for name
	 public String getName() {
	     return name;
	 }

	 // Getter for age
	 public int getAge() {
	     return age;
	 }
	 
	 @Override
		public String toString() {
			return "Voter [voterId=" + voterId + ", name=" + name + ", age=" + age + "]";
		}
	}