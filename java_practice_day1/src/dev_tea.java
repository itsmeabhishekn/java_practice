import java.util.Scanner ;

public class dev_tea {

    public static void devTeaTime(){
        System.out.println("Waiting for dev team time ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter anything to start dev tea time ");
        input.next();
        System.out.println("Dev tea time has started ");
    }

    public static void main(String[] args){
        System.out.println("Welcome to your new job ");
        devTeaTime();
        System.out.println("write code ");
        System.out.println("review code ");

        devTeaTime();

        System.out.println("get promoted");


    }

}
