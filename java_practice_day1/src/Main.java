import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Enter a number between 1 and 10  : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(number<5){
            System.out.println("ENjoy the luck a friend brings you ");

        }
        else {
            System.out.println("your shoe selection will make you happy today");
        }
    }
}