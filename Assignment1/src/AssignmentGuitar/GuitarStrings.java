package AssignmentGuitar;

public class GuitarStrings {
	char stringOne;
	char stringTwo;
	char stringThree;
	char stringFour;
	char stringFive;
	char stringSix;
	
	public GuitarStrings(char stringOne, char stringTwo,char stringThree, char stringFour, char stringFive, char stringSix ) {
		
	}
	
	public void setStrings(char stringOne, char stringTwo,char stringThree, char stringFour, char stringFive, char stringSix ) {
		this.stringOne = stringOne;
		this.stringTwo = stringTwo;
		this.stringThree = stringThree;
		this.stringFour = stringFour;
		this.stringFive = stringFive;
		this.stringSix = stringSix;
	}
	
	
	public char getStringsOne() {
		return stringOne;
	}
	public char getStringsTwo() {
		return stringTwo;
	}
	public char getStringsThree() {
		return stringThree;
	}
	public char getStringsFour() {
		return stringFour;
	}
	public char getStringsFive() {
		return stringFive;
	}
	public char getStringsSix() {
		return stringSix;
	}
	
}
