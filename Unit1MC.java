
/**
 * Write a description of class Unit1MC here.
 *
 * @Sravani Duggirala
 * @version (a version number or a date)
 */
public class Unit1MC
{
 public static void main(String[] args) {
     System.out.println("----------");
     System.out.println("Unit 1 MCQ");
     System.out.println("----------");
     System.out.println("1.3 Skill 2b");
     
     /*
      * Which of the following arithmetic expressions evaluates to 1 ?

         I. 2 / 5 % 3
        II. 2 / (5 % 3)
       III. 2 / 5 + 1
       
       Correct Answer: D) II and III
       */
      
      int optionI = 2 / 5 % 3;
      int optionII = 2 / (5 % 3);
      int optionIII = 2 / 5 + 1;
      
      System.out.println("I." + optionI);
      System.out.println("II." + optionII);
      System.out.println("III." + optionIII);
      
      /*
      
       Explanation: 
       Expression I = 0 because 2/5=0 and 0%3=0. 
       Expression II = 1 because 5%3=2 and 2/2=1.
       Expression III = 1 because 2/5=0 and 0+1=1.
       
      */
     System.out.println("------------");
     System.out.println("1.5 Skill 2b");
  
  /*
   * Consider the following code segment.
   
   double d = 0.25;
   int i = 3;
   double diff = d - i;
   System.out.print((int)diff - 0.5);
   
   What is printed as a result of executing the code segment?
   
   Correct Answer: B) -2.5
   */
   
   double d = 0.25;
   int i = 3;
   double diff = d - i;
   System.out.print((int)diff - 0.5);
   System.out.println();
   
   /*
    * Explanation: The difference between .25 and 3 is -2.75,
      but when this is cast as an int, it is truncated to -2. -2-0.5=-2.5
    */
   System.out.println("------------");
   System.out.println("1.5 Skill 5b");
   
   /*
    * Consider the following code segment, which is intended to display 6.0.

      double fact1 = 1 / 2;
      double fact2 = 3 * 4;
      double product = fact1 * fact2;
      System.out.println(product);

      Which of the following best describes the error, if any, in the code segment?
      
      Correct Answer: B) Either the numerator or the denominator of the fraction 1 / 2 should be cast as double.
    */
   
   System.out.print("Old:");
   double fact1 = 1 / 2;
   double fact2 = 3 * 4;
   double product = fact1 * fact2;
   System.out.println(product);
   
   System.out.print("New:");
   double denominator = 2.0;
   fact1 = 1 / denominator;
   fact2 = 3 * 4;
   product = fact1 * fact2;
   System.out.println(product);
   
   
   /*
    * Explanation: The correct answer is B) because 1 and 2 are stored as int types by default. meaning that 1/2 would be 0. 
    * Casting one of them as a double will produce the correct output of 6.0.
    */
     
}}
