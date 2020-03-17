
/**
 * Write a description of class Unit5MC here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Unit5MC
{
         public static void main(String[] args) {
     System.out.println("----------");
     System.out.println("Unit 5 MCQ");
     System.out.println("----------");
     System.out.println("5.2 Skill 1c");
     
/*
* Consider the following class definition.
       public class Person
        {
          private String name;
          // missing constructor
        }
The statement below, which is located in a method in a different class, 
creates a new Person object with its attribute name initialized to "Washington".
       
       Person p = new Person("Washington");

Which of the following can be used to replace // missing constructor 
so that the object p is correctly created?

Correct Answer: D)
   public Person(String n)
    {
      name = n;
    }
*/

Person p = new Person("Washington");
System.out.println(p);
 
/*
 * Explanation: The constructor must be public or else it won't be able to be accessed
 * outside of the class. The String parameter is assigned to the instance variable name by the constructor
 */
     
System.out.println("----------");
System.out.println("5.5 Skill 4b");
     
     /*
      * Consider the class definition below. The method levelUp is intended to increase a Superhero object’s strength attribute by the parameter amount. The method does not work as intended.

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
        public int levelUp(int amount)  // line 14
        {
        strength += amount;          // line 16
        }
        }
        Which of the following changes should be made so that the levelUp method works as intended?
        Correct Answer: A) In line 14, levelUp should be declared as type void.
        */
       
    Superhero s = new Superhero("John", "Devil", 5);
	    s.levelUp(3);
	    System.out.println(s);
    
    
       
       
     
        /*
         * Explanation: 
         */
     
}}
