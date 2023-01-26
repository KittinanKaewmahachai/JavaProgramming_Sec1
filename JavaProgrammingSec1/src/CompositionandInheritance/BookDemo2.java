package CompositionandInheritance;

import javax.swing.JOptionPane;

public class BookDemo2 {

	public static void main(String[] args) {
		String name1 = JOptionPane.showInputDialog("Input author name: ");
		String email1 = JOptionPane.showInputDialog("Input author e-mail: ");
		String title1 = JOptionPane.showInputDialog("Input book title: ");
		int page = Integer.parseInt(JOptionPane.showInputDialog("Input book page: "));
		Book1 book = new Book1(title1,new Author1(name1,email1),page);
		int check = JOptionPane.showConfirmDialog(null,"Is the page correct",
				"Confirm",
				JOptionPane.YES_NO_OPTION);
		while(check!=0) {
			page = Integer.parseInt(JOptionPane.showInputDialog("Input book page,again: "));
			book.setPage(page);
		}
		JOptionPane.showMessageDialog(null, "Book Title :"+book.getTitle()+
				"\nAuthor name : "+name1+" ("+book.getPage()+" page)"+
				"\nAuthor e-mail:"+email1);

	}

}
