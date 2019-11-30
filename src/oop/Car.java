package oop;

public class Car {
    int odomStart;
    int odomEnd;
    double g;
    double mpg;
    int count=0;
    public Car(int startMile){
        odomStart=startMile;
                
    }
    void fillUp(int miles, double gallons){
        odomEnd=miles;
        g=gallons;
        
    }
    public double calculateMPG(){
        mpg=(odomEnd-odomStart)/g;
        return mpg;
    }
    boolean gasHog(){
        if (mpg<15){
            return true;
        }
        else {return false;}
    }
    boolean economyCar(){
        if (mpg>30){
            return true;
        }
        else{return false;}
    }
    
}

