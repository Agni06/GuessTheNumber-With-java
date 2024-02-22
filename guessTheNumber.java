mport java.util.Scanner;
import java.util.Random;


public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String play = "yes";
    while(play.equals("yes"))
      {
        Random rm = new  Random();
        int ranNum = rm.nextInt(100);
        int guess = -1;
        int tries =  0;
        while(guess!=ranNum)
          {
            System.out.println("Guess a number between 1 and 100");
            guess = sc.nextInt();
            tries ++;
            if(guess==ranNum)
              
              System.out.println("Congrats! You guessed the number");
              
              System.out.println("You guessed the number in "+tries+" tries"); 

              System.out.println("Would you like to continue the game? yes or no");
              play = sc.next();
              play = play.toLowerCase();
              
            }
            if(guess>ranNum)
            {
              System.out.println("Your guess is too high try again");
              
            }
            else
            {
              System.out.println("Your guess is too low try again");
              
              
            }
            
            
            
          }
      }
    
  }

}
