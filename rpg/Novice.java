public class Novice extends basicCharacter {

    //instance variables
    private int levelCap = 10;

    //constructors
    public Novice(String initName) {
	super(initName);
    }

    //methods
    public void levelUp() {
	if (getLevel() + 1 <= 10) {
	    super.levelUp();
	}
    }
    public boolean promoChecker() {
	return (getLevel() == 10);
    }
    public void noviceConstitution() {
	buffHealth(20);
    }

}