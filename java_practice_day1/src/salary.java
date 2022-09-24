public class salary {

    public static double salaryCalc(double weekWorkHours, double payPerHour, int vacationDays){
        double numberOfWeeks = 52.1429;


        // finds out the number of hours to deduct , because there were few holidays

        double deductionHoursPay = vacationDays *8 * payPerHour;

        // calculating the total salary
        double payPerWeek =   weekWorkHours * payPerHour;

        double payPerYear = payPerWeek * 52;

        double actualPay = payPerYear - deductionHoursPay;



        return actualPay;
    }

    public static void main(String[] args) {

        System.out.println(salaryCalc(30,15,4));

    }

}
