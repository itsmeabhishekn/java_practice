public class tip_calc {

    public static double tipCalculate(double listedMealPrice ,
                                    double taxRate,
                                    double tipRate){
        double tip = tipRate*listedMealPrice;
        double tax = taxRate*listedMealPrice;
        double result = listedMealPrice+tip+tax;

        System.out.println("The total bill price is : "+result);

        return result;
    }

    public static void main(String[] args) {
        double groupTotalPrice = tipCalculate(120,.2,.3);

        double individualMealPrice = groupTotalPrice /5 ;

        System.out.println("amount payable by each person is " +individualMealPrice);
    }

}
