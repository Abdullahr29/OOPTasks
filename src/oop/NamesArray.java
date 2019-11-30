package oop;

 public class NamesArray {
     public static void main(String []args){
         int howM = Integer.parseInt(input("How many names:"));
         String names[] = new String[howM];
         int grades[] = new int[howM];
         int total=0,highest=0, lowest=2000;;
         String highN=" ", lowN=" ";
         for (int count = 0;count<howM;count++){
             String name=input("Enter name:");
             names[count]=name;
             int grade=Integer.parseInt(input("Enter grade:"));
             grades[count]=grade;
             total=total+grade;
             if (grade>highest){
                 highest=grade;
                 highN=name;
             }
             if (grade<lowest){
                 lowest=grade;
                 lowN=name;
             }
         }
         int avg;
         avg=total/howM;
         int choice = Integer.parseInt(input("Would you like to sort in descending(0), ascending(1), or neither(2):"));
         if (choice==0){
             String tempe;
             int temp;
             for (int i=0;i<howM;i++){
                 for (int j=0;j<howM;j++){
                     if (j!=(howM-1)){
                         if (grades[j]<(grades[j+1])){
                             temp=grades[j];
                             grades[j]=grades[j+1];
                             grades[j+1]=temp;
                             tempe=names[j];
                             names[j]=names[j+1];
                             names[j+1]=tempe;
                         }
                     }
                 }
             }
         }
         else if(choice==1){
             String tempe;
             int temp;
             for (int i=0;i<howM;i++){
                 for (int j=0;j<howM;j++){
                     if (j!=(howM-1)){
                         if (grades[j]>(grades[j+1])){
                             temp=grades[j];
                             grades[j]=grades[j+1];
                             grades[j+1]=temp;
                             tempe=names[j];
                             names[j]=names[j+1];
                             names[j+1]=tempe;
                         }
                     }
                 }
             } 
         }
         for (int count=0;count<howM;count++){
             output(names[count]+" "+grades[count]);
         }
         output("Highest: "+highest+" "+highN);
         output("Lowest: "+lowest+" "+lowN);
         output("Average: "+avg);
     }
     static String input(String prompt)
     { return javax.swing.JOptionPane.showInputDialog(null,prompt); }
     static void output(String message)
     { javax.swing.JOptionPane.showMessageDialog(null,message); } 
 }
