import java.util.Scanner;

public class choices {
    public static void main(String[] args){
        String question = "How old are you ";
        String choiceOne = "ten";
        String choiceTwo = "twentyfour";
        String choiceThree = "fifteen";

        String correctAnswer = choiceTwo ;

        //writing a print statement with question

        System.out.println(question);

        // writing  a print statement giving the answer choices

        System.out.println("Chooose one of the following option "+
                choiceOne + ", " + choiceTwo + ", " + choiceThree + ".");

        //have the use input as an answer

        Scanner input = new Scanner(System.in);

        //retrieve the user input

        String answer = input.next();

        //check if the given answer is correct

        if(correctAnswer.equals(answer)){
            System.out.println("congrats correct answer ");
        }
        else {
            System.out.println(" you are incorrect the correct answer is " + correctAnswer);
        }


    }
}
