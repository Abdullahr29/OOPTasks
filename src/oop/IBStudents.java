package oop;

public class IBStudents {
    private String name;
    private int age;
    private double height;
    private double weight;
    public IBStudents(String nm, int ag, double ht, double wt){
        this.name=nm;
        this.age=ag;
        this.height=ht;
        this.weight=wt;
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    double getHeight(){
        return height;
    }
    double getWeight(){
        return weight;
    }
    void setName(String na){
        name=na;
    }
    void setAge(int ag){
        age=ag;
    }
    void setHeight(double hei){
        height=hei;
    }
    void setWeight(double wei){
        weight=wei;
    }    
}
