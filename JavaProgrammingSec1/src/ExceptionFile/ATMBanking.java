package ExceptionFile;

import java.io.*;
import java.util.*;

public class ATMBanking {

	public static void main(String[] args) throws IOException{
		Scanner console = new Scanner(System.in);
		PrintStream prs = new PrintStream(new File("ATMBookBank.txt"));
		System.out.print("Enter account number : ");
		accountNumber = console.next();
		System.out.print("Enter password : ");
		password = console.next();

	}

}
