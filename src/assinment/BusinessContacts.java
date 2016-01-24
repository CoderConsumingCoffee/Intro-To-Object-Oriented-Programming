package assinment;

import java.io.IOException;

public class BusinessContacts extends Contacts{

	
	private String jobTitle;
	public void setJobTitle(String i){
		jobTitle = i;
	}
	public String getJobTitle(){
		return jobTitle;
	}

	private String org;
	public void setOrg(String i){
		org = i;
	}
	public String getOrg(){
		return org;
	}

	
public BusinessContacts(String input) throws IOException{
	super(input);
	
	System.out.println("Input Job Title:");
	this.setJobTitle(br.readLine());

	
	System.out.println("Input Organization:");
	this.setOrg(br.readLine());
	
 
 }



public String toString(){
	return "****** Business Contact ******\n"+super.toString()+"\nJob Title: "+this.getJobTitle()+"\nOrganization: "+this.getOrg()+"\n";
}
}
