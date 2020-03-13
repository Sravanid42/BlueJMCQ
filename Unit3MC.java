
/**
 * Write a description of class Unit3MC here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Unit3MC
{
     public static void main(String[] args) {
     System.out.println("----------");
     System.out.println("Unit 3 MCQ");
     System.out.println("----------");
     System.out.println("3.3 Skill 4a");
     
     /*
      * In the code segment below, the int variable temp represents a temperature in degrees Fahrenheit. The code segment is intended to print a string based on the value of temp. The following table shows the string that should be printed for different temperature ranges.

            Temperature Range	String to Print
            31 and below	"cold"
            32–50	"cool"
            51–70	"moderate"​
            71 and above	"warm"

      * String weather;
        if (temp <= 31)
          {
            weather = "cold";
          }
        else
          {
            weather = "cool";
          }
       if (temp >= 51)
          {
            weather = "moderate";
          }
       else
          {
            weather = "warm";
          }
       System.out.print(weather);

    Which of the following test cases can be used to show that the code does NOT work as intended?

    I. temp = 30
    II. temp = 51
    III. temp = 60
    Correct Answer: A) I only
    */
   int temp = 30;  
   String weather;
        if (temp <= 31)
          {
            weather = "cold";
          }
        else
          {
            weather = "cool";
          }
       if (temp >= 51)
          {
            weather = "moderate";
          }
       else
          {
            weather = "warm";
          }
       System.out.print(weather);
   
     /*
      * Explanation: temp =30, the else-clause of the second conditional statement assigns "warm", because temp >=51 evaluates to false. The answer should be "cold" 
        temp = 51 or 60,the if-clause of the second conditional statement assign "moderate" to weather,because the condition temp >= 51 evaluates to true.
        This is the intended correct.
      */
     
     System.out.println("----------");
     System.out.println("3.7 Skill 2c");
     
     /*
      * Consider the following code segment.

        String first = new String("duck");
        String second = new String("duck");
        String third = new String("goose");
        if (first == second)
          {
            System.out.print("A");
          }
        else if (second == third)
          {
            System.out.print("B");
          }
        else if (first.equals(second))
          {
            System.out.print("C");
          }
        else if (second.equals(third))
          {
            System.out.print("D");
          }
        else
          {
            System.out.print("E");
          }
        What is printed as a result of executing the code segment?
        Correct Answer: C) C
      */
     
     String first = new String("duck");
        String second = new String("duck");
        String third = new String("goose");
        if (first == second)
          {
            System.out.print("A");
          }
        else if (second == third)
          {
            System.out.print("B");
          }
        else if (first.equals(second))
          {
            System.out.print("C");
          }
        else if (second.equals(third))
          {
            System.out.print("D");
          }
        else
          {
            System.out.print("E");
          }
     /*
      * Explanation: == operator compares object reference not content, so the 1sta nd 2nd conditions are false. Since the first two have the same
        content, the 3rd evaluates to true, printing C.
      */
     System.out.println("----------");
     System.out.println("3.4 Skill 4c");
     
     /*
      * 
      */
     
     /*
      * 
      */
     
     System.out.println("----------");
     System.out.println("3.6 Skill 4c");
     
     /*
      * 
      */
     
     /*
      * 
      */
}}
