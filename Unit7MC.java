import java.util.ArrayList;
/**
 * Write a description of class Unit7MC here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Unit7MC
{
    public static void main(String[] args) {
     System.out.println("----------");
     System.out.println("Unit 7 MCQ");
     System.out.println("----------");
     System.out.println("7.1 Skill 1b");
     System.out.println("----------");
     /*
      * Consider the following statement, which is intended to create an ArrayList named numbers that can be used to store Integer values.

        ArrayList<Integer> numbers = // missing code;

        Which of the following can be used to replace // missing code so that the statement works as intended?

        new ArrayList()
        new ArrayList<Integer>
        new ArrayList<Integer>()
        Correct Answer: C) I and III only
      */
     ArrayList<Integer> numbers = new ArrayList();
     ArrayList<Integer> num = new ArrayList<Integer>();
     
     
     /*
      * Explanation: Statement I correctly declares an ArrayList object that can contain Integer objects. 
      * Statement II results in a syntax error, as the call to the ArrayList constructor must contain (). 
      * Statement III correctly declares an ArrayList object that can contain elements only of type Integer.
      */
     System.out.println("----------");
     System.out.println("7.5 Skill 5c");
     System.out.println("----------");
     /*
      * Consider the method seqSearch, which implements a sequential search algorithm.
public int seqSearch(int[] arr, int target)
{
for (int j = 0; j < arr.length; j++)
{
if (arr[j] == target)
{
return j;
}
}
return -1;
}
Consider another method, seqSearch2, which modifies seqSearch to use an enhanced for loop.
public int seqSearch2(int[] arr, int target)
{
for (int j : arr)
{
if (j == target)
{
return j;
}
}
return -1;
}
Which of the following best describes the difference in the behavior of seqSearch2 relative to seqSearch as a result of the modification?
Correct Answer: E) 
The modification in seqSearch2 will cause the value of target to be returned instead of the index of target in cases where target appears in arr.      
*/
int target = 10;
int[] arr = {2, 4, 6, 8, 10};
  for (int j = 0; j < arr.length; j++)
{
if (arr[j] == target)
{
System.out.println(j);
}
}
System.out.println(-1);

for (int j : arr)
{
if (j == target)
{
System.out.println(j);
}
}
System.out.println(-1);


 /*
 * Explanation: The enhanced for loop stores the values of each array element in the variable j. 
* Each array element is compared to target. If the array element is equal to target, j is returned, which is equal to the value of target.
*/
     
System.out.println("----------");
System.out.println("7.6 Skill 2d");
System.out.println("----------");
/*
 * 
* Consider the following correct implementation of the insertion sort algorithm.
public static void insertionSort(int[] elements)
{
for (int j = 1; j < elements.length; j++)
{
int temp = elements[j];
int possibleIndex = j;
while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
{
elements[possibleIndex] = elements[possibleIndex - 1];
possibleIndex--;   // line 10
}
elements[possibleIndex] = temp;
}
}
The following declaration and method call appear in a method in the same class as insertionSort.
int[] arr = {10, 8, 3, 4};
insertionSort(arr);
How many times is the statement possibleIndex--; in line 10 of the method executed as a result of the call to insertionSort ?
Correct Answer: D) 5
*/

int[] arr1 = {10, 8, 3, 4};
for (int j = 1; j < arr1.length; j++)
{
int temp = arr1[j];
int possibleIndex = j;
while (possibleIndex > 0 && temp < arr1[possibleIndex - 1])
{
arr1[possibleIndex] = arr1[possibleIndex - 1];
possibleIndex--;   // line 10
System.out.println("line 10 executed");
}
arr1[possibleIndex] = temp;
}


/*
* Explanation: The while loop iterates once each time an array element is shifted to the right as a result of an insertion. 
* Therefore, the statement in line 10 is executed each time an element is shifted to the right. 
* For the given array, 10 is shifted right when 8 is inserted before it. Then 8 and 10 are each shifted right when 3 is inserted before them.
* Lastly, 8 and 10 are each shifted right when 4 is inserted before them. 
* A total of five shifts occur, so the statement in line 10 is executed five times.
*/
System.out.println("----------");
System.out.println("7.6 Skill 2d");
System.out.println("----------");
     /*
      * Consider the following correct implementation of the selection sort algorithm.
public static void selectionSort(int[] elements)
{
for (int j = 0; j < elements.length - 1; j++)
{
int minIndex = j;
for (int k = j + 1; k < elements.length; k++)
{
if (elements[k] < elements[minIndex])
{
minIndex = k;
}
}
if (j != minIndex)
{
int temp = elements[j];
elements[j] = elements[minIndex];
elements[minIndex] = temp;   // line 19
}
}
}
The following declaration and method call appear in a method in the same class as selectionSort.
int[] arr = {30, 40, 10, 50, 20};
selectionSort(arr);
How many times is the statement  elements[minIndex] = temp;  in line 19 of the method executed as a result of the call to selectionSort ?
Correct Answer: C) 3
      */
int[] elements = {30, 40, 10, 50, 20};
for (int j = 0; j < elements.length - 1; j++)
{
int minIndex = j;
for (int k = j + 1; k < elements.length; k++)
{
if (elements[k] < elements[minIndex])
{
minIndex = k;
}
}
if (j != minIndex)
{
int temp = elements[j];
elements[j] = elements[minIndex];
elements[minIndex] = temp;   // line 19
System.out.println("line 19 executed");
}
}
 
     /*
      *Explanation: The statement in line 19 executes each time a value is swapped into the correct position in the array. 
      *For the given array, the values 30 and 10 are swapped. 
      *Then the values 40 and 20 are swapped. Then, since 30 is already in the correct position, no swap occurs.
      *Lastly, 50 and 40 are swapped.
      */
     
     
}

}
