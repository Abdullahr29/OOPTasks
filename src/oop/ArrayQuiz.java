package oop;

 public class ArrayQuiz {
     public static void main(String []args){
         int quest = Integer.parseInt(input("Which Question:"));
         if (quest==1){
             int ans=question1();
             output(ans+"");
         }
         if (quest==2){
             int ans=question2();
             output(ans+"");
         }
         if (quest==3){
             String ans=question3();
             output(ans);
         }
         if (quest==4){
             String ans=question4();
             output(ans);
         }
         if (quest==5){
             String ans=question5();
             output(ans); 
         }
         if (quest==6||quest==7){
             String ans=question6();
             output(ans); 
         }
     }     
     static int question1(){
         int [] nums={5,7,4,8,9,1,6,4,2,0};
         int total=0;
         for (int count=0;count<10;count++){
             if (nums[count]>5)
                 total=total+nums[count];
         }
         return total;
     }
     static int question2(){
         int nums[]={5,7,4,8,9,1,6,4,2,0};
         int high=-138299;
         int low=83102290;
         for (int count=0;count<10;count++){
             if (nums[count]>high)
                 high=nums[count];
             if (nums[count]<low)
                 low=nums[count];
         }
         int range;
         range=high-low;
         return range;
     }
     static String question3(){
         int nums[]={5,7,4,8,9,1,6,4,2,0};
         int num[]={5,7,4,8,9,1,6,4,2,0};
         int temp;
         for (int i=0;i<10;i++){
             for (int j=0;j<10;j++){
                  if (j!=(9)){
                     if (nums[j]<(nums[j+1])){
                         temp=nums[j];
                         nums[j]=nums[j+1];
                         nums[j+1]=temp;
                     }
                 }
             }
         }
         for (int i=0;i<10;i++){
             for (int j=0;j<10;j++){
                  if (j!=(9)){
                     if (num[j]>(num[j+1])){
                         temp=num[j];
                         num[j]=num[j+1];
                         num[j+1]=temp;
                     }
                 }
             }
         }
         String a="Ascending: ";
         for (int count=0;count<10;count++)
             a=a+(num[count]+" ");
         a=a+"\nDescending: ";
         for (int count=0;count<10;count++)
             a=a+(nums[count]+" ");
         return a;  
     }
     static String question4(){
         int nums[]={5,7,4,8,9,1,6,4,2,0};
         int num[]={2,5,6,7,84,1,5,4,5,9};
         int total[]=new int[20];
         int z=0;
         for (int count=0;count<10;count++){
             total[z]=nums[count];
             z++;
         }
         for (int count=0;count<10;count++){
             total[z]=num[count];
             z++;
         }
         String a="Combination: ";
         for (int count=0;count<20;count++)
             a=a+(total[count]+" ");
         return a;    
     }
     static String question5(){
         int nums[]={5,7,4,8,9,1,6,41,2,12};
         int num[]={2,5,6,7,84,1,5,4,5,9};
         int num1[]=new int[20];
         int flag=-1;
         for(int count=0;count<10;count++){
             flag=-1;
             for(int counter=0;counter<10;counter++){
                 if (num[counter]==nums[count])
                     flag=counter;
                 if (flag>-1)
                     num[flag]=-76493847;
             }
         }
         int z=0;
         for (int count=0;count<10;count++){
             num1[z]=nums[count];
             z++;
         }
         for (int count=0;count<10;count++){
             if (num[count]!=-76493847){
                 num1[z]=num[count];
                 z++;
             }
         }
         String a="Combination(without duplicates): ";
         for (int count=0;count<20;count++)
             a=a+(num1[count]+" ");
         return a; 
     }
     static String question6(){
         String nums[]={"abdullah","disha","hafiz","salma","marium","adam","salman","sayed","eyad","sulaiman"};
         String num[]={"azam","disha","cameron","veer","abdullah","azim","irmak","sayed","hafiz","fares"};
         String num1[]=new String[20];
         String num2[]= new String[10];
         int flag=-1;
         for(int count=0;count<10;count++){
             flag=-1;
             for(int counter=0;counter<10;counter++){
                 if (num[counter].equals(nums[count])){
                     flag=counter;
                     num2[count]=num[counter];
                 }
                 if (flag>-1)
                     num[flag]=" ";
             }
         }
         int z=0;
         for (int count=0;count<10;count++){
             num1[z]=nums[count];
             z++;
         }
         for (int count=0;count<10;count++){
             if (num[count].equals(" "))
                 z++;
             else{
                 num1[z]=num[count];
                 z++;
             }      
         }
         String a="Combination(without duplicates): ";
         for (int count=0;count<20;count++){
             if (num1[count]!=null)
                 a=a+(num1[count]+" ");
         }
         a=a+"\nThese had duplicates:";
         for (int count=0;count<10;count++)
             if (num2[count]!=null)
                 a=a+(num2[count]+" ");
         return a;    
     }
     static String input(String prompt)
     { return javax.swing.JOptionPane.showInputDialog(null,prompt); }
     static void output(String message)
     { javax.swing.JOptionPane.showMessageDialog(null,message); } 
 }
