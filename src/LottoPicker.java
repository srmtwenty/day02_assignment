/*
    LottoPicker will generate a random number
    and print out 5 random numbers  0-30 to the user

    1-figure out how to generate problem
    2-repeat step 1, 5 times
    3-we need to store the results of step2
    4-we need to find a way to print the results that were stored along the way


    casting? WHere are the capital
    PascalCase - where the first letter and every first letter of every word is capitalized
    camelCase - the first letter of the first word is lower case, but every other first letter is capitalized
 */
import java.util.Random;
public class LottoPicker {
    //class will contain all methods(behavior)

    public static void main(String [] args){
        //reference name is completely upto you
        //datatype variable name = theValueToBeStored
        /*String nameOfIt="Application Started...";
        int x=5;
        float y = 5.5F;

        System.out.println(nameOfIt); */

        //double randomNumber = Math.random();

        //System.out.println(randomNumber);

        Random random = new Random();

        int numberOfNumbersGenerated=0;
        int total=5;

        while(numberOfNumbersGenerated<total){
            int randomNumber1 = random.nextInt(30);
            System.out.println(randomNumber1);
            //re-assign result
            //variable don't change in their own
            numberOfNumbersGenerated+=1;
        }

        // (numberOfNumbersGenerated < total) -> evaluates to true or false
        // needs to be a statement that evaluates to true or false


        /* programming is the combination of iteratives and conditions
         Iteratives - repeating a process over and over
         Conditional - checking a condition (true or false) to decide what to do.

         Control flow - different types of statement that affect the flow of a program

             Iterative - loops;
                  while loop - while condition is true, keep executing
                  do while loop - similar to while loop, guaranteed to run once


             Condition -
                  if - checks if a condition is true, if it is it will execute once
                  else - executes if an if statement evaluates other one.*/
    }
}
