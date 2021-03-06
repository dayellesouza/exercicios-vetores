package application;

import java.util.Locale;
import java.util.Scanner;

import entitie.People;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		People[] vect = new People[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Rent #"+ (i+1));
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[room] = new People(name, email, room);
		}
		
		
		System.out.println("\nBusy rooms:");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(vect[i].getRoom() 
						+ ": "
						+ vect[i].getName()
						+ ", "
						+ vect[i].getEmail());
			}
		}
		
		sc.close();
	}

}
