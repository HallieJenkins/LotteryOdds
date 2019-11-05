/**
 * A program to simulate a lottery drawing.
 * 
 * Hallie Jenkins
 * 10/22/2019
 */
 
import java.util.Scanner;
public class Lottery
{
    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);
       String lotteryNum = "";
       String userGuess = "";        
       int digits = 3;
       int randInt;        
        for(int counter = 1; counter<=digits; counter++)
        {
        randInt = (int)Math.floor(Math.random() * 9);
        lotteryNum = lotteryNum + randInt;        
        }

       
       System.out.println("Enter your number: ");       
       userGuess = in.next();      
      
       if (lotteryNum.charAt(0) == userGuess.charAt(0) && lotteryNum.charAt(1) == userGuess.charAt(1) && 
       lotteryNum.charAt(2) == userGuess.charAt(2))
       {
           System.out.println ("Congratulations! All your numbers matched!");
       }
       
       else if (lotteryNum.charAt(0) == userGuess.charAt(0) && lotteryNum.charAt(1) == userGuess.charAt(1))
        {
            System.out.println("Congratulations! Your first pair matched!");
        }


       else if (lotteryNum.charAt(1) == userGuess.charAt(1) && lotteryNum.charAt(2) == userGuess.charAt(2))
        {
            System.out.println("Congratulations! Your second pair matched!");
        }
       
       else
        {
           System.out.println ("You had no matches. Better luck next time!");
        }
        
    } 
}