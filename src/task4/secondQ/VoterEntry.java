package task4.secondQ;

public class VoterEntry {
	
public static void main(String[] args) {
		     
	// Creating a voter object with a valid age
    try {
        Voter voter1 = new Voter(1, "Narendra Kumar", 25);
        System.out.println("Voter created: " + voter1.getName());
    } catch (InvalidAgeForVoterException e) {
        System.out.println(e.getMessage());
    }

    // Attempting to create a voter object with an invalid age
    try {
        Voter voter2 = new Voter(2, "Bob", 17);  // This should throw InvalidAgeForVoterException
        System.out.println("Voter created: " + voter2.getName());
    } catch (InvalidAgeForVoterException e) {
        System.out.println(e.getMessage());
    }

}
}
		         

