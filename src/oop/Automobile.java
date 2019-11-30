package oop;

 public class Automobile {
     private double mpg;
     private double gallons;
     public Automobile(double pg){
         mpg=pg;
         gallons=0;
     }
     void fillUp(double fl){
         gallons=gallons+fl;
     }
     void takeTrip(double tt){
         gallons=gallons-(tt/mpg);
     }
     double reportFuel(){
         return gallons;
     }
     
        
    
    
    
}
