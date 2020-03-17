
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
      
    int num1 = 20;
    int initial;
    initial = DigitSumInitial(20);
    System.out.println("Initial:" + initial);
    
    int num2 = 20;
    int III;
    III = DigitSumIII(20);
    System.out.println("III:" + III);
    
    
    

    /*
       * Explanation: Code segment I(doesn’t work): Ex. If num is 12, 1st iteration, total set to 2 and num set to 1 and h increments to 1. 
       * Loop terminates because h<num evaluates to false and incorrect result of 2
       * Code segment II(doesn’t work): If num is 12, the for loop will add j % 10 to total for all values of j from 12 to 1. incorrect result of 48. 
       * Code segment III(works!!!): Variable k initially set to num. Rightmost digit is the remainder when k/10. 
         This remainder is added to the total. k/10 then removes the rightmost digit. 
         Process repeats as each digit of num is added to total and terminate after a final digit is added as k/=10 sets k to 0. 

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
     String word = "computer";
     int num = 3;
     String m;
     m = mystery("computer", 3);
     System.out.println(m);
     
  
    /*
      * Explanation: The int variable k varies from 3 to 0 so the loop will execute 4 times. In the first iteration word.substring(0,3), "com" is appended to teh result
      * In the second, "co" is appended to the result. In the third, "c" is appended to the result. In the fourth, "" is appended to the result, resulting in "comcoc".
      */
     
     
      
}
    public static String mystery(String word, int num)
        {
        String result = "";
        for (int k = num; k >= 0; k--)
        {
        result += word.substring(0, k);
        }
        return result;
}
public static int DigitSumInitial(int num1)
        {
          int total = 0;
          while (num1 > 0)
           {
             total += num1 % 10;
             num1 /= 10;
           }
          return total;
        }
        public static int DigitSumIII(int num2)
        {
          int total = 0;
          for (int k = num2; k > 0; k /= 10)
               {
                  total += k % 10;
               }
          return total;
        }
    }
