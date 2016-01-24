package assinment;
import java.io.IOException;


public class PersonalContact extends Contacts{
	private String birthDay;
	
	public void setBirthDay(String i){
		birthDay = i;
	}
	public String getBirthDay(){
		return birthDay;
	}

	
public PersonalContact(String input) {
	super(input);
	
	try {
		System.out.println("Input Birthday:");
		this.setBirthDay(br.readLine());
	} catch (IOException e) {
		System.out.println("Exception in the Personal contact. Call to super constructor was fine."); 
		e.printStackTrace();
	}
	
 }

public String toString(){
	return "****** Personal Contact ******\n"+ super.toString() +"\nBirthday: "+this.getBirthDay()+"\n";
}
}
