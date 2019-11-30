package oop;

 public class Puppy {
     private String name;
     private int age;
     private String colour;
     private String breed;
     private boolean gender;
     Puppy(String nm){
         this.name=nm;
         this.age=0;
         colour="black";
         breed="Poodle";
         gender=true;
     }
     void setAge(int ag){
         age=ag;
     }
     void setColour(String cl){
         colour=cl;
     }
     void setBreed(String br){
         breed = br;
     }
     void setGender(boolean gen){
         gender=gen;
     }
     int getAge(){
         return age;
     }
     String getName(){
         return name;
     }
     String getColour(){
         return colour;
     }
     String getBreed(){
         return breed;
     }
     void Printer(){
         System.out.println(name+" "+age+" "+colour+" "+breed+" "+gender);
     }
 }
