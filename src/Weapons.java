
public class Weapons {
		   enum FreshJuiceSize{ SMALL, MEDIUM, LARGE }
		   FreshJuiceSize size;


public static void main(String args[]){
	      Weapons juice = new Weapons();
	      juice.size = Weapons.FreshJuiceSize.MEDIUM ;
	      System.out.println("Size: " + juice.size);
}
