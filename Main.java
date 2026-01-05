// import java.util.Scanner;
// public class Main{
//     public static void main(String args[]){
//     System.out.println("Welcome to the Number Guessing Game");
//     System.out.println();
//     System.out.println("You have to guess a number between 1- 100");
//     Scanner sc = new Scanner(System.in);
//     while (true) { 
        

//         Number obj = new Number();
//        int guess = obj.num();
//        int tries = obj.choice();
//           System.out.println("Enter choice:");
//           tries = sc.nextInt();
//     }
//     }
// }
// class Number{
//     static int num;
//       static int choice;
//     // public int guess;
    
//     public static int num(){
//         // System.out.println((int)(1+ Math.random()*101));
//         return (int)(1+ Math.random()*101);
//     }

//     public int choice(){
//         if(choice == num){
//             System.out.println("You guessed it right!");
//         }
//         else if(choice > num){
//             System.out.println("Too High!!");
//         }
//         else if(choice < num ){
//             System.out.println("Too low!!");
//         }
//         else{
//             System.out.println("Error occured!!!!");
//         }
//         return choice;
//     }

//     // public void setchoice(Number number, int choice){
//     //      number.choice = choice;
//     //  }
//     //  public int getchoice(){
//     //     return choice;
//     //  }
    
     
    

// }
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("You have to guess a number between 1 and 100.");

        Scanner sc = new Scanner(System.in);

        while (true) {
            NumberGame game = new NumberGame();
            game.generateNumber(); // generate target number
            int attempts = 0;
            boolean guessedCorrectly = false;

            while (!guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int userGuess = sc.nextInt();
                attempts++;

                guessedCorrectly = game.checkGuess(userGuess);
            }

            System.out.println("You guessed it in " + attempts + " tries!");

            System.out.print("Do you want to play again? (yes/no): ");
            String again = sc.next();
            if (!again.equalsIgnoreCase("yes")) {
                System.out.println("Thanks for playing!");
                break;
            }
        }

        sc.close();
    }
}
class NumberGame {
    private int target;

    public void generateNumber() {
        target = (int)(1 + Math.random() * 100);
    }

    public boolean checkGuess(int guess) {
        if (guess == target) {
            System.out.println("You guessed it right!");
            return true;
        } else if (guess > target) {
            System.out.println("Too high!");
        } else {
            System.out.println("Too low!");
        }
        return false;
    }
}
