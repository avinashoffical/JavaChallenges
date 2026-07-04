import java.util.Scanner;

class NumberGuessingGame {
    int random;
    NumberGuessingGame(){
        random=(int) Math.ceil(Math.random()*100);
    }

    /**
     * @param guessNUmber
     * @return
     * -Negative, if guessed number is smaller
     * 0, if the guessed number is correct
     * Positive, if the guessed number is higher.
     */
    int guess(int guessNUmber){
        return guessNUmber - random;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        NumberGuessingGame game=new NumberGuessingGame();
        System.out.println("Welcome to Number Guessing Game");
        System.out.println("Guess the number between 1 to 100");
        int guess, result;
        do{
            System.out.print("Guess the number: ");
            guess= input.nextInt();
            result=game.guess(guess);
            if (result==0){
                System.out.println("your guess is correct");
            } else if (result<0) {
                System.out.println("Please guess higher number");
            }else{
                System.out.println("Please guess lower number");
            }
        }while(result!=0);
    }

}
