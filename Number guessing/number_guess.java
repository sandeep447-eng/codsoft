import java.util.*;
public class number_guess {
    public static void guessNumberGame(){
        Scanner sc=new Scanner(System.in);

        // generate random numbers
        int number=1+(int)(100*Math.random());

        // Given t trials
        int t=5;
        int i,guess;

        System.out.println("A number is chosen"
                            +"between 1 to 100."
                            +"Guess the number"
                            +" within 5 trails.");

        // Iterate over T Trials
        for(i=0; i<t; i++){
            System.out.println("Guess the number:");

            // take input for guessing 
            guess = sc.nextInt();

            // if the number is guessed
            if(number == guess){
                System.out.println("Congratulations!"
                                    +"You guessed the number.");
                break;
            }
            else if(number > guess && i!=t-1){
                System.out.println("The number is "+" greater than "+guess);
            }
            else if(number < guess && i!=t-1){
                System.out.println("The number is "+" less than "+guess);
            }
        }
        if(i==t){
            System.out.println("You have exhausted"+" t trails.");
            System.out.println("The number was "+number);
        }
    }
    // driver code
    public static void main(String[] args) {
        //function call
        guessNumberGame();
    }
}
