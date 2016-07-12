import java.util.Scanner;

public class betaTest {

	//public static void main(String[] args) {
		Scanner keyboard; // creates the new Scanner Object
		keyboard = new Scanner(System.in);
		boolean Encounter = true;
		boolean Peaceful = true;
		boolean reponseLoop = true;
		int Angercount = 0;
		String sentence = "null";
		String Keyword = "Garibay";

while (reponseLoop = true) { // the loop that holds the response
	System.out.println("ResponseLoop	beta test");

//	if (Angercount == 2) {
//		System.out.println("'This is it. Prepare to die.");
//		Peaceful = false;
//		break;
//	}
	

//while (Peaceful = true) {
		System.out.println("#What would you like to say?");
		sentence = keyboard.next();
		System.out.println();

		// if creature is peaceful
		if (sentence.contains(Keyword)){
			System.out.println("'The Garibay Gold is from Garibay... Home of the Trolls.'");
		}
		//else  {
		//	System.out.println("'I do not understand this insolence. This is your final warning.'");
		//	Angercount = Angercount + 1;
		//}
	}	
	//else if (Peaceful == false) {// creature is not peaceful
		//System.out.println("The " + NonPlayerCharacter + " does not what to talk.");
		//break;
		//} 
	

//} //end or response loop
} //end of main loop
}