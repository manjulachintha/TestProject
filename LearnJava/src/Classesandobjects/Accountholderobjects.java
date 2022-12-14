package Classesandobjects;

public class Accountholderobjects {
	
	public static void main(String[] args) {
		
		Accountholder Sai = new Accountholder();
		Accountholder Ram = new Accountholder();
		Accountholder Dev = new Accountholder();
		
		Sai.Firstname = "Sai";
		Sai.Lastname = "Last";
		Sai.age = 20;
		Sai.acctbalance= 20000;
		
		Ram.Firstname = "Sai";
		Ram.Lastname = "Last";
		Ram.age = 25;
		Ram.acctbalance= 26000;		
		
		Sai.EligibilityforCC();
		System.out.println(" Creditcard Eligibility for Sai = " +Sai.EligibilityforCC);
		
		Ram.EligibilityforCC();
		System.out.println(" Creditcard Eligibility for Ram = " + Ram.EligibilityforCC);
	}
	
	

}
