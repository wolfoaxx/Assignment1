package AssignmentGuitar;


public class Participant {
	String firstName;
	String lastName;
	String race;
	String sessionTime;
	
	


public Participant (String firstName, String lastName,String race,String sessionTime) {
	this.firstName=firstName;
	this.lastName = lastName;
	this.race = race;
	this.sessionTime = sessionTime;
	}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
	
}

public String getFirstName() {
	return firstName;
}

public String getLastName() {
	return lastName;
}


public void setRace(String race) {
	this.race = race;
}

public String getRace() {
	return race;
}

public void setSessionTime(String sessionTime) {
	this.sessionTime = sessionTime;
}

public String getSessionTime() {
	return sessionTime;
}

public String toString() {
	return firstName + lastName;
}

}
