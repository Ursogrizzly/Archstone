import java.util.Scanner;
public class GameTest {
	public static void main(String[] args) {
		Scanner keyboard;
		keyboard = new Scanner(System.in);
		
		PlayerStats Player1;
		Player1 = new PlayerStats();
		
		System.out.print("What is your Carry Limit?");
		Player1.setPlayerCarryLimit((double) keyboard.nextDouble());
		System.out.print("What is your Carry Weight?");
        Player1.setPlayerCarryWeight((double) keyboard.nextDouble());
        System.out.println(Player1.toString());
		keyboard.close();
	}
}