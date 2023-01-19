import java.util.Scanner;

public class Lab504 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Please enter your name, separated by a space."+"\n:");
		String fName = scan.next();
		String mName = scan.next();
		String lName = scan.next();
		String fullName = fName+mName+lName;
		System.out.println(abbreviatName(fullName));
		
	}
	public static String abbreviatName(String fullname) {
		String shortName = "";
		for(int i=0;i<fullname.length();i++) {
			if(fullname.charAt(i)==' ') {
				shortName = (shortName + fullname.charAt(i+1)).toUpperCase();
				shortName =  shortName + ".";
			}
		}
		return shortName;
	}

}
