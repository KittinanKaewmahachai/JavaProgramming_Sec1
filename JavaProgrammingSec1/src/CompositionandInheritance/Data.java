package CompositionandInheritance;

public class Data {
	private int dMonth; //variable to store the month
	private int dDay; //variable to store the day
	private int dYear; //variable to store the year
	
	//Default Constructor
	//The instance variables dMonth,dDay, and dYear are set to the default variable
	//Postcondition : dMonth = 1; dDay=1;dYear = 1900;
	public Data() {
		dMonth = 1;
		dDay = 1;
		dYear = 1900;
	}
	
	//Constructor to set the data
	public Data(int month,int day,int year) {
		dMonth = month;
		dDay = day;
		dYear = year;
	}
	
	//Nethod to set the data
	public void setDate(int month,int day,int year) {
		dMonth = month;
		dDay = day;
		dYear = year;
	}
	
	//Method to return the month
	public int getMonth() {
		return dMonth;
	}
	public int getDay() {
		return dDay;
	}
	public int getYear() {
		return dYear;
	}
	public String toString() {
		return getMonth()+ "-" + getDay() + "-" + getYear();
	}
	

}
