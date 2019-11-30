package oop;

import java.util.Arrays;
public class OOPTester{
    public static void main(String []args){
        String [] names = {"Alpha", "Beta", "Delta", "Epsilon","Gamma","Lambda","Mu","Omega"};
        binarySearch(names, "epsilon");
        

        
        
        
               
        
    }
    public static void binarySearch(String []list, String find){
         int low = 0;
         int high = list.length;
         while(high >= low) {
             int middle = (low + high) / 2;
             if(list[middle].toLowerCase().contains(find)){ 
                 System.out.println("Found");
                 break;
             }     
             if(list[middle].toLowerCase().compareTo(find)<0){ 
                 low = middle + 1;
                 System.out.println(list[middle].toLowerCase().compareTo(find));
             }    
             if(list[middle].toLowerCase().compareTo(find)>0){ 
                 high = middle - 1;
                 System.out.println(list[middle].toLowerCase().compareTo(find));
             }    
         }  
    }
        
           
     static String input(String prompt)
     { return javax.swing.JOptionPane.showInputDialog(null,prompt); }
     static void output(String message)
     { javax.swing.JOptionPane.showMessageDialog(null,message); }  
}

 
     

