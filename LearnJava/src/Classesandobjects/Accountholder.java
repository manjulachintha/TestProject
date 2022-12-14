package Classesandobjects;

public class Accountholder {
	
	String Firstname;
	String Lastname;
	int age;
	float acctbalance;
	Boolean EligibilityforCC;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void EligibilityforCC(){
		if(age==25 && acctbalance>=20000) {
			EligibilityforCC= true;
		}
			else {
				EligibilityforCC= false;	
			}
		}
	}


