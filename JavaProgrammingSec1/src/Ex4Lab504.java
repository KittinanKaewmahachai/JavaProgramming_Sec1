import java.util.Scanner;

public class Ex4Lab504 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Please enter your name, separated by a space."+"\n:");
		String fullName = scan.nextLine();
		String firstName = fullName.substring(1,fullName.indexOf(' '));
		System.out.println(abbreviatName(fullName)+fullName.toUpperCase().charAt(0)+firstName);
		
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
