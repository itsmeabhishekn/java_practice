import java.util.Scanner;

public class song {
    public static void main(String[] args ){
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;

        while(isOnRepeat){
            System.out.println("playing current song");
            System.out.println("Do you want to take this song from out of repeat , if yes type yes");
            String userInput = input.next();

            if(userInput.equals("yes")){
                isOnRepeat=false;
            }
        }
        System.out.println("playing next song");
    }
}
