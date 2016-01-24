package assinment;

import java.io.IOException;
import java.util.ArrayList;


//use a switch statement

public class ContactBook implements KeyboardReadable {
	ArrayList<Contacts> c = new ArrayList<>();
	Quit quit = Quit.KEEP_RUNNING;
	
	
	
	void runApp(){
		while (quit != Quit.MAIN_QUIT) {
			// Display main menu
			quit = Quit.KEEP_RUNNING;
			String menuItems = "";
			try {
				System.out
						.println("Please make a selection from the following: \r1: To add a Business contact enter. \r2: To add a Personal contact enter. "
								+ "\r3: To display all contacts enter. \r4: To quite at any time enter");
				menuItems = br.readLine();
				
			} catch (IOException ioe) {
				// TODO Auto-generated catch block
				ioe.printStackTrace();
			}
			

			// Main menu switch statement
			switch (menuItems) {
			case "1": {
				addBusinessContact();
			}

				break;
			case "2": {
				addPersonalContact();
			}

				break;
			case "3": {

				displayAllContactsAndSubmenu();

			}

				break;

			case "4": {
				quit = Quit.MAIN_QUIT;
				break;

			}
			default: {
				try {
					System.out
							.println("******Invalid Selection****** \nPress enter to return to main menu.\nYou may then make a selection from the list by pressing the corresponding number\nfollowed by the enter or return key.");
					br.readLine();
				} catch (IOException ioe) {
					// TODO Auto-generated catch block
					ioe.printStackTrace();
				}
				
				

			}
				break;
			}

		} 
	}
	
	void addBusinessContact(){
		BusinessContacts b;
		try {
			b = new BusinessContacts(br.readLine());
			c.add(b);
			System.out.println("Successfully Added:");
			b.toString();
		} catch (IOException ioe) {
			// TODO Auto-generated catch block
			ioe.printStackTrace();
		}
		
	}

	void addPersonalContact(){
		try {
			PersonalContact p = new PersonalContact(br.readLine());
			c.add(p);
			System.out.println("Successfully Added:");
			p.toString();
		} catch (IOException ioe) {
			// TODO Auto-generated catch block
			ioe.printStackTrace();
		}
	}
	
	
	void displayAllContactsAndSubmenu(){
		do {
			String B = "";
			System.out
					.println("Make a selection from bellow by typing the number of the contact you wish to view.\nOr enter Q at any point to return to main menu");
			for (int i = 0; i < c.size(); i++) {
				//Contacts g = c.get(i);
				int t = i + 1;
				System.out.println(t + ": " + c.get(i).getFstName() + " "
						+ c.get(i).getLstName());
			}
			try {
				B = br.readLine();
			} catch (IOException ioe1) {
				// TODO Auto-generated catch block
				ioe1.printStackTrace();
			}

			if (B.equalsIgnoreCase("Q")) {
				quit = Quit.INNER_QUIT;
				break;
			}

			try {
				for (int i = 0; i < Integer.parseInt(B); i++) {

					if (c.size() < Integer.parseInt(B)) {
						System.out
						.print("Invalid selection. Please press any button and try to make a selection again.");
					}
					else{
						
						System.out.println(c.get(i).toString()
								+ "\nPress enter to return to menu");

						br.readLine();
						
					}
					

				}


			} catch (NumberFormatException e) {
				System.out.println("ERROR, You must select a number");
			
			}
			catch (IOException ioe){
				ioe.printStackTrace();
			}

		} while (quit != Quit.INNER_QUIT);
	}


	


}
