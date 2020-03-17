
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
       System.out.println(weather);
   
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
            System.out.println("A");
          }
        else if (second == third)
          {
            System.out.println("B");
          }
        else if (first.equals(second))
          {
            System.out.println("C");
          }
        else if (second.equals(third))
          {
            System.out.println("D");
          }
        else
          {
            System.out.println("E");
          }
     /*
      * Explanation: == operator compares object reference not content, so the 1sta nd 2nd conditions are false. Since the first two have the same
        content, the 3rd evaluates to true, printing C.
      */
     System.out.println("----------");
     System.out.println("3.4 Skill 4c");
     
     /*
      * Consider the following two code segments. Assume that variables x and y have been declared as int variables and have been assigned integer values.
        I.
          int result = 0;
          if (x > y)
            {
              result = x - y;
              System.out.print(result);
            }
          else if (x < y)
            {
              result = y - x;
              System.out.print(result);
            }
          else
            {
              System.out.print(result);
            }
        II.
          if (x < y)
            {
              System.out.print(y - x);
            }
              else
            {
              System.out.print(x - y);
             }
        Which of the following correctly compares the outputs of the two code segments?
        Correct Answer: A) Code segment I and code segment II produce the
        same output for all values of x and y.
        */
       System.out.println("x<y");
       System.out.println("Old:");
       int x = 5;
       int y = 6;
       int result = 0;
          if (x > y)
            {
              result = x - y;
              System.out.println(result);
            }
          else if (x < y)
            {
              result = y - x;
              System.out.println(result);
            }
          else
            {
              System.out.println(result);
            }
       
      System.out.println("New:");
      if (x < y)
            {
              System.out.println(y - x);
            }
              else
            {
              System.out.println(x - y);
             }
       System.out.println("x>y");
       System.out.println("Old:");
       int a = 6;
       int b = 5;
       int result2 = 0;
          if (a > b)
            {
              result = a - b;
              System.out.println(result2);
            }
          else if (a < b)
            {
              result = b - a;
              System.out.println(result2);
            }
          else
            {
              System.out.println(result2);
            }
       
      System.out.println("New:");
      if (a < b)
            {
              System.out.println(b - a);
            }
              else
            {
              System.out.println(a - b);
             }
             System.out.println("x=y");
       System.out.println("Old:");
       int c = 5;
       int d = 5;
       int result3 = 0;
          if (c > d)
            {
              result = x - y;
              System.out.println(result3);
            }
          else if (c < d)
            {
              result = y - x;
              System.out.println(result3);
            }
          else
            {
              System.out.println(result3);
            }
       
      System.out.println("New:");
      if (c < d)
            {
              System.out.println(d - c);
            }
              else
            {
              System.out.println(c - d);
             }
     /*
      * Explanation: Since both code segments print out |x-y|.
      * When x>y, x-y is printed
      * When x<y, y-x is printed
      * When x=y, 0 is printed
      */
     
     System.out.println("----------");
     System.out.println("3.6 Skill 4c");
     
     /*
      * In the following expression, j, k, and m are properly declared and initialized int variables.
        !((j == k) && (k > m))
        Which of the following is equivalent to the expression above?
        Correct Answer: B) (j != k) || (k <= m)
      */
     int j = 1;
     int k = 2;
     int m = 3;
     System.out.println("!((j == k) && (k > m)):" + !((j == k) && (k > m)));
     System.out.println((j != k) || (k <= m));
     
     
     /*
      * Explanation: De Morgan's law states thht !(A && B) is equal to !A || !B
      !A is j!=k and B is k>m, then !B k<=m. Therefore, j != k || k<=m
        */
}}
