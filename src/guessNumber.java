import java.util.*;
public class guessNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int guess=0;
        int attempt=0;
        int rand=(int)(Math.random()*100)+1;

        while(guess!=rand){
            System.out.print("Guess the number: ");
            guess=sc.nextInt();
            attempt++;

            if(guess>rand){
                System.out.println("Its high!! Try Again");
            }
            else if (guess<rand){
                System.out.println("Its low!! Try Again");
            }
            else{
                System.out.println("Congratulations! You guessed it!");
            }
        }
        sc.close();
    }
}
