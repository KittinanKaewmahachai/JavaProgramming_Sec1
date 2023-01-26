package CompositionandInheritance;

import java.util.Scanner;

public class BookDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Input author name :");
	    String name = scan.nextLine();
	    System.out.print("Input author e-mail :");
	    String email = scan.next();
	    
	    Author1 worapat = new Author1(name,email);
	    System.out.println(worapat);
	    
	    System.out.print("Input book title:");
	    scan.nextLine();
	    String title = scan.nextLine();
	    System.out.print("Input Book page : ");
	    int page = scan.nextInt();
	    
	    System.out.println();
	    Book1 book = new Book1(title,worapat,page);
	    System.out.println(book);

	}

}
