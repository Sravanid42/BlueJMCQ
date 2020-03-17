
/**
 * Write a description of class Superhero here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


public class Superhero

{

private String name;

private String secretIdentity;

private int strength;

public Superhero(String realName, String codeName)

{

name = realName;

secretIdentity = codeName;

strength = 5;

}

public void levelUp(int amount)  // line 14

{

strength += amount;          // line 16

}
public String toString() {
		return (name + ", " + secretIdentity + ", " + strength);
		
	}


}