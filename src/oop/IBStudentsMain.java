package oop;

import java.util.*;
public class IBStudentsMain {
    static ArrayList <IBStudents> student = new ArrayList();
    static ArrayList <IBStudents> temp = new ArrayList();
    static ArrayList <String> studentN = new ArrayList();
    static ArrayList <Double> studentH = new ArrayList();
    public static void main(String []args){
        menu();      
    }
    public static void menu(){
        int choice=0;
        while(choice!=8){
            choice=Integer.parseInt(input("Main Menu:\n1.Enter a new student\n2.Remove a student\n3.Sort on name\n4.Search for a name\n5.Sort based on height\n6.Edit a student\n7.Display\n8.Quit"));
            if(choice==1)
                enter();
            else if(choice==2){
                remove();
            }
            else if(choice==3){
                sortN();
            }
            else if(choice==4){
                searchN();
            }
            else if(choice==5){
                sortH();
            }   
            else if(choice==6){
                edit();
            }
            else if(choice==7)
                display();     
        }
    }
    public static void enter(){
        int howM=Integer.parseInt(input("How many students would you like to enter: "));
        for(int count=0;count<howM;count++){
            String name = input("Enter the name of the student: ");
            int age=Integer.parseInt(input("Enter the student's age: "));
            double height =Double.parseDouble(input("Enter the student's height: "));
            double weight =Double.parseDouble(input("Enter the student's weight: "));
            student.add((new IBStudents(name,age,height,weight)));
            studentN.add(name);
            studentH.add(height);
        }
    }
    public static void remove(){
        int flag=0;
        String newname = input("Which name would you like to remove: ");
        for(IBStudents p: student){
            if((p.getName().equalsIgnoreCase(newname))||(p.getName().substring(0,p.getName().indexOf(" ")).equalsIgnoreCase(newname))||(p.getName().substring(p.getName().indexOf(" ")+1).equalsIgnoreCase(newname))){
               student.remove(p);
               flag=1;
            }        
        }
        if(flag==0){
            output("This name was not found");
        }
    }
    public static void sortN(){
        Collections.sort(studentN);
        temp.clear();
        for(IBStudents p: student){
            temp.add(p);
        }
        student.clear();
        for(String p: studentN){
            for(IBStudents c: temp){
                if(p.equals(c.getName())){
                    student.add(c);
                }
            }
        }
        output("The list of students has been sorted");
    }
    public static void searchN(){
        int flag=0;
        String newname = input("Which name would you like to search for: ");
        for(IBStudents p: student){
            if((p.getName().equalsIgnoreCase(newname))||(p.getName().substring(0,p.getName().indexOf(" ")).equalsIgnoreCase(newname))||(p.getName().substring(p.getName().indexOf(" ")+1).equalsIgnoreCase(newname))){
                output("Student name: "+p.getName()+"\nStudent age: "+p.getAge()+"\nStudent height: "+p.getHeight()+"cm\nStudent weight: "+p.getWeight()+"Kg");
                flag=1;
            }        
        }
        if(flag==0){
            output("This name was not found");
        }
    }
    public static void sortH(){
        Collections.sort(studentH);
        temp.clear();
        for(IBStudents p: student){
            temp.add(p);
        }
        student.clear();
        for(double p: studentH){
            for(IBStudents c: temp){
                if(p==(c.getHeight())){
                    student.add(c);
                }
            }
        }
        output("The list of students has been sorted");
    }
    public static void edit(){
        String newname = input("Who do you want to edit: ");
        String editor = input("Which attribute would you like to change(\"Name\"or\"Age\"or\"Height\"or\"Weight\"): ");
        int flag=0;
        for(IBStudents p: student){
            if((p.getName().equalsIgnoreCase(newname))||(p.getName().substring(0,p.getName().indexOf(" ")).equalsIgnoreCase(newname))||(p.getName().substring(p.getName().indexOf(" ")+1).equalsIgnoreCase(newname))){
                if(editor.equals("Name")){
                    String edt = input("What would you like to change the name to: ");
                    p.setName(edt);
                    output("The name has been changed");
                }
                else if(editor.equals("Age")){
                    int edt = Integer.parseInt(input("What would you like to change the age to: "));
                    p.setAge(edt);
                    output("The age has been changed");
                }
                else if(editor.equals("Height")){
                    double edt = Double.parseDouble(input("What would you like to change the height to: "));
                    p.setHeight(edt);
                    output("The height has been changed");
                }
                else if(editor.equals("Weight")){
                    double edt = Double.parseDouble(input("What would you like to change the weight to: "));
                    p.setWeight(edt);
                    output("The weight has been changed");
                }
                else
                    output("This option does not exist");
                flag=1;
            }        
        }   
        if (flag==0){
            output("This name does not exist");
        }
    }
    public static void display(){
        for(IBStudents p: student)            
            System.out.println("Student name: "+p.getName()+"\tStudent age: "+p.getAge()+"\tStudent height: "+p.getHeight()+"cm\tStudent weight: "+p.getWeight()+"Kg");
    }
    static String input(String prompt){
        return javax.swing.JOptionPane.showInputDialog(null,prompt); }
    static void output(String message){
        javax.swing.JOptionPane.showMessageDialog(null,message); }    
}
