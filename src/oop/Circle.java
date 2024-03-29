package oop;

 public class Circle {
     public Circle(double r){
         radius = r;
     }
     public double area(){
         double a = Math.PI*radius*radius;
         return a;
     }
     public double circumference(){
         double c = 2*Math.PI*radius;
         return c;
     }
     public double diameter(){
         double d = 2*radius;
         return d;
     }
     void setRadius(double rad){
         radius=rad;
     }
     public double radius;
 }
