package task4.secondQ;

public //Custom exception for age being less than 18 for a voter
class InvalidAgeForVoterException extends Exception {
	 public InvalidAgeForVoterException(String message) {
	     super(message);
	 }
	}