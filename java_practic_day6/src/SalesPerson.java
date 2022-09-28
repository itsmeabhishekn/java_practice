public class SalesPerson extends Employee {

   private double commissionPercentage;

   public SalesPerson(String name,double salary , int age,double commissionPercentage){
       super(name,salary,age);
       this.commissionPercentage = commissionPercentage;
   }

   public double getCommissionPercentage(){
       return  this.commissionPercentage;
   }

   public void raiseCommission(){
       if(this.commissionPercentage<.30){
           this.commissionPercentage = commissionPercentage*1.2;
       }
   }
}
