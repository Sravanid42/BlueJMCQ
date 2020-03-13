
/**
 * Write a description of class Unit4MC here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Unit4MC
{
     public static void main(String[] args) {
     System.out.println("----------");
     System.out.println("Unit 4 MCQ");
     System.out.println("----------");
     System.out.println("4.2 Skill 4c");
     
     /*
      * Consider the method digitSum below, which takes a positive integer parameter as input.

        public int digitSum(int num)
        {
          int total = 0;
          while (num > 0)
           {
             total += num % 10;
             num /= 10;
           }
          return total;
        }

         Which of the following code segments could replace the while loop in the method digitSum without changing the value returned by the method?
            I.
              for (int h = 0; h < num; h++)
               {
                 total += num % 10;
                 num /= 10;
               }
            II.
              for (int j = num; j > 0; j--)
               {
                 total += j % 10;
               }
            III.
              for (int k = num; k > 0; k /= 10)
               {
                  total += k % 10;
               }
       Correct Answer: C) III only
       */
      
      System.out.print("old:");
      /*public int digitSum(int num)
        {
          int total = 0;
          while (num > 0)
           {
             total += num % 10;
             num /= 10;
           }
          return total;
        }
        */
      System.out.print("new:");
      
      /*
       * public int digitSum(int num)
        {
          int total = 0;
          for (int k = num; k > 0; k /= 10)
               {
                  total += k % 10;
               }
          return total;
        }
       */
      
      /*
       * Explanation: 
       */
     System.out.println("----------");
     System.out.println("4.3 Skill 2c");
     
     /*
      * public String mystery(String word, int num)
        {
        String result = "";
        for (int k = num; k >= 0; k--)
        {
        result += word.substring(0, k);
        }
        return result;
    }
    What is returned as a result of the call mystery("computer", 3) 
    Correct Answer: B: comcoc
      */
     
     /*
      * 
      */
     
     
      
}}
