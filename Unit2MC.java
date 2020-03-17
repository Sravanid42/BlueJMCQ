
/**
 * Write a description of class Unit2MC here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Unit2MC
{
     public static void main(String[] args) {
     System.out.println("----------");
     System.out.println("Unit 2 MCQ");
     System.out.println("----------");
     System.out.println("2.2 Skill 1c");
     
     /*
      * Consider the following class declaration.
        public class Thing
         {
             private String color;

         public Thing()
          {
             color = "Blue";
          }
 
         public Thing(String setColor)
          {
             color = setColor;
          }
        }
        
      Which of the following code segments, when appearing in a class other than Thing, would create a reference of type Thing with a value of null ?
      Correct Answer: D) Thing someThing;
      */
     
     Thing someThing = null;
     System.out.println(someThing);
    
     
     /*
      * Explanation: Option D declares a a variable type Thing named someThing but never initializes it so the value will be null.
      */
     System.out.println("----------");
     System.out.println("2.9 Skill 1b");
     
     /*
      * The code segment below is intended to randomly print one of the values 2, 4, 6, or 8 with equal probability.

        int val = * missing code *;
        val *= 2;
        System.out.print(val);

        Which of the following can be used to replace * missing code * so that the code segment works as intended?
        Correct Answer: D) (int) (Math.random() * 4 + 1)
        */
       int val = (int) (Math.random() * 4 + 1);
       val *= 2;
       System.out.print(val);
       
     /*
      * Explanation: Since Math.random.() produces a random double from 0 to 1, doing (Math.random() * 4 + 1) produces a random double 
        greater than or equal to 1 and less than 5. Casting this to an int, we get one of the numbers {1, 2, 3, 4}.
        Multiplying the random value by 2, produces one of {2, 4, 6, 8}
      */
       
     
     
     
     
    }
     
}
