package assinment;

import java.io.IOException;


//KeyboardInterface allows buffered reading of keyboard inputs via k.x()
abstract public class Contacts implements KeyboardReadable{

	/*
	 * Initialize string variable,
	 * Create setter method,
	 * Create getter method,
	 * For each variable of the Contacts super class.
	 */
	private String fstName;
	private String lstName;
	private String address;
	private String phnNmbr;
	private String emailAd;

	
	//Adding contact info with k from keyboard interface to contacts object.
		Contacts(String input) {
			
			try {
				System.out.println("Input First Name:");
				this.setFstName(br.readLine());
				
				System.out.println("Input Last Name:");
				this.setLstName(br.readLine());
				
				System.out.println("Input the Address:");
				this.setAddress(br.readLine());
				
				System.out.println("Input Phone Number:");
				this.setPhnNmbr(br.readLine());
				
				System.out.println("Input Email Address:");
				this.setEmailAd(br.readLine());
			} catch (IOException e) {
				// In the event of an invalid input passed to the Contacts constructor 
				System.out.println("Invalid IO in the Contacts constructor");
				e.printStackTrace();
			}
		}
	
	
	
	
	
	
	
	
	//First Name
	public void setFstName(String i){
		fstName = i;
	}
	public String getFstName(){
		return fstName;
	}
	//Last name
	public void setLstName(String i){
		lstName = i;
	}
	public String getLstName(){
		return lstName;
	}
	//Address 
	public void setAddress(String i){
		address = i;
	}
	public String getAddress(){
		return address;
	}
	//Phone number
	public void setPhnNmbr(String i){
		phnNmbr = i;
	}
	public String getPhnNmbr(){
		return phnNmbr;
	}
	
	public void setEmailAd(String i){
		emailAd = i;
	}
	public String getEmailAd(){
		return emailAd;
	}

	
	
	//Method for returning contact details
	public String toString(){
		return "First Name: "+this.getFstName()+"\nLast Name: "+this.getLstName()+"\nAddress: "+this.getAddress()+"\nPhone Number: "+this.getPhnNmbr()+"\nEmail Address: "+this.getEmailAd();
	}
}
