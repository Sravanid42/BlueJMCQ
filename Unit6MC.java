
/**
 * Write a description of class Unit6MC here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Unit6MC
{
    public static void main(String[] args) {
     System.out.println("----------");
     System.out.println("Unit 6 MCQ");
     System.out.println("----------");
     System.out.println("6.3 Skill 4c");
     
/*
 * Consider the following class definition.
public class Toy
{
private int yearFirstSold;
public int getYearFirstSold()
{
return yearFirstSold;
}

//There may be instance variables, constructors, and other methods not shown.
}
The following code segment, which appears in a class other than Toy,   prints the year each Toy object in toyArray was first sold by its manufacturer. 
Assume that toyArray is a properly declared and initialized array of Toy objects.
for (Toy k : toyArray)
{
System.out.println(k.getYearFirstSold());
}
Which of the following could be used in place of the given code segment to produce the same output?
I.
for (int k = 0; k < toyArray.length; k++)
{
System.out.println(getYearFirstSold(k))
}
II.
for (int k = 0; k < toyArray.length; k++)
{
System.out.println(k.getYearFirstSold());
}
III.
for (int k = 0; k < toyArray.length; k++)
{
System.out.println(toyArray[k].getYearFirstSold());
}

Correct Answer: C) III only
*/
String[] toyArray = {"bear", "barbie", "car", "dollhouse"};
System.out.println("----------");
System.out.println("Original");
System.out.println("----------");
for (String k : toyArray)

{

System.out.println(toyArray[1]);

}
System.out.println("----------");
System.out.println("Option II");
System.out.println("----------");

for (int k = 0; k < toyArray.length; k++)

{

System.out.println(toyArray[1]);

}

/*
 * Explanation: Correct. Code segment I uses the loop control variable k improperly, 
 * as a parameter for the getYearFirstSold method rather than as an array index. 
 * Code segment II also uses the loop control variable k improperly, as an object reference rather than as an array index. 
 * Code segment III uses the loop control variable k as an index into toyArray and the expression toyArray[k] 
 * as the required Toy object reference for the getYearFirstSold method call.
 */


}
}
