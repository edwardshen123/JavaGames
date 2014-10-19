import java.util.Scanner;

public class Stuyablo {

    public void printOptions(String[] actionPossible) {
	for (int counter = 0; counter < actionPossible.length; counter++) {
	    System.out.print(actionPossible[counter] + "||");
	}
	System.out.print("\n");
    }
    public void Encounter() {
    }
    public void raceOptions() {
	String[] Races = {};
	for (int counter = 0; counter < Races.length, counter++) {
	    System.out.print(Races[counter] + " || ");
	}
	System.out.print("\n");
    }

    public static void main(String[] args) {

	Stuyablo controller = new Stuyablo();
	
	Scanner user_input = new Scanner(System.in);

	System.out.println("Welcome to the land of Stuylandia, travelers");
	System.out.println("Can I get your names?");

	System.out.print("Enter the warrior's name: ");
	String wName = user_input.next();
	System.out.print("Enter the warrior's race: ");
	String wRace = user_input.next();
	PC warrior = new PC(wName, wRace, "Warrior");
	
        System.out.print("Enter the mage's name: ");
	String mName = user_input.next();
	System.out.print("Enter the mage's race: ");
	String mRace = user_input.next();
	PC mage = new PC(mName, mRace, "Mage");

	System.out.print("Enter the rogue's name: ");
	String rName = user_input.next();
	System.out.print("Enter the mage's race: ");
	String rRace = user_input.next();
	PC rogue = new PC(rName, rRace, "Rogue");
	
	System.out.print("Enter the priest's name: ");
	String pName = user_input.next();
	System.out.print("Enter the priest's race: ");
	String pRace = user_input.next();
	PC priest = new PC(pName, pRace, "Priest");

	System.out.println(warrior + ", " + mage + ", " + rogue + ", " + priest + ". You are all now registered as official adventurers. Good Luck");
	
	World Stuy = new World();

	System.out.println("The four adventurers enter the town of " + Stuy.getLocation());

	String[] actions = Stuy.actionOptions();
	controller.printOptions(actions);
    }

}
