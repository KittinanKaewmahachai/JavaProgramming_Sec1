package CompositionandInheritance;

public class PersonalInfo {
	private Person name;
	private Data bDay;
	private int personID;
	
	public PersonalInfo() {
		name = new Person();
		bDay = new Data();
		personID = 0;
	}
	
	
	public PersonalInfo(String first,String last,int month,int day,int year,int ID) {
		name = new Person(first,last);
		bDay = new Data(month,day,year);
		
		personID = ID;
	}
	
	public void setPersonalInfo(String first,String last,int month,int day,int year,int ID) {
		name.setName(first, last);
		bDay.setDate(month,day,year);
		personID = ID;
	}
	
	public String toString() {
		return "Name: " + name.toString() + "\n" 
				+ "Date of birth: " + bDay.toString() 
				+ "\n" + "Personal ID: " + personID;
	}

}
