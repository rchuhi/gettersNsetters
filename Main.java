/*Reginah Chuhi
CIS221
Tuesday and Thursday 2:10pm*/

package getSetter;

public class Main {
 String make;
 int year;
 
	public static void main(String[] args) {
		
		Main a = new Main();
		//Sets the make to Mercedes
		a.setMake("Mercedes");
		//sets the year to 2021
		a.setYear(2021);
		//calls the printDetails method
		a.printDetails();
	}

	public void setMake (String make){
		//sets the make
		this.make = make;		
	}
public void setYear(int year){
	//sets the year
	this.year=year;
	
}
public String getMake() {
//	gets the make
	return this.make;
	
}
public Integer getYear() {
	//gets the year
	return this .year;
}
public void printDetails() {
	//prints the make and year
	System.out.println(getMake() + ", " + getYear());
}
}

