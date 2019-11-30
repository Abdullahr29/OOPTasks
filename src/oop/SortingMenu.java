package oop;

 public class SortingMenu {
     public static void main(String []args){
         int menuNum[]=new int[15];
         int choice=0;
         while (choice!=7){
             choice=Integer.parseInt(input("Which option would you like to do:\n1.Add numbers in array\n2.Linear Search\n3.Binary Search\n4.Bubble Sort (with average and range)\n5.Selection Sort\n6.Delete a number\n7.Quit"));
             if (choice==1){
                 menuNum=part1();
                 String a="";
                 for (int count=0;count<15;count++)
                     a=a+(menuNum[count]+" ");
                 output(a);
                 output("All numbers have been added");
                 System.out.println(a);
             }
             if (choice==2){
                 int sm=Integer.parseInt(input("Enter the number you want"));
                 sm = part2(sm, menuNum);
                 if (sm!=0)
                     output("Here is the index:"+sm+" ");
                 else
                     output("Index not found!!!");   
             }
             if (choice==3){
                 int sm=Integer.parseInt(input("Enter the number you want"));
                 menuNum=part5(menuNum);
                 String a="";
                 for (int count=0;count<15;count++)
                     a=a+(menuNum[count]+" ");
                 output(a);
                 sm=part3(sm, menuNum);
                 if (sm!=-1)
                     output("Here is the index: "+sm+" ");
                 else
                     output("Index not found!!!");
             }
             if (choice==4){
                 menuNum=part4(menuNum);
                 String a="";
                 int avg, high=0, low=1000, total=0, range;
                 for (int count=0;count<15;count++){
                     a=a+(menuNum[count]+" ");
                     if(menuNum[count]>high)
                         high=menuNum[count];
                     if(menuNum[count]<low)
                         low=menuNum[count];
                     total=total+menuNum[count];
                 }
                 range=high-low;
                 avg=total/15;
                 output(a);
                 output("The average is: "+avg+" and the range is: "+range);
             }
             if (choice==5){
                 menuNum=part5(menuNum);
                 String a="";
                 for (int count=0;count<15;count++)
                     a=a+(menuNum[count]+" ");
                 output(a);
             }
             if (choice==6){
                 int sm=Integer.parseInt(input("Enter the number you wish to delete"));
                 sm=part2(sm, menuNum);
                 menuNum=part6(sm, menuNum);
                 String a="";
                 for (int count=0;count<14;count++)
                     a=a+(menuNum[count]+" ");
                 output(a);
             }    
         }
     }
     static int[] part1(){
         int menuNum[]=new int[15];
         for (int count=0;count<15;count++){
             menuNum[count]=Integer.parseInt(input("Enter a number: "));
         }
         return menuNum;  
     }
     static int part2(int sm, int[] menuNum){
         int index=0;
         for (int count=0;count<15;count++){
             if (menuNum[count]==sm)
                 index=count;
         }
         return index;
     }
     static int part3(int sm, int[] nums){
         int low = 0;
         int high = 14;
         while(high >= low) {
             int middle = (low + high) / 2;
             if(nums[middle] == sm) 
                 return middle;
             if(nums[middle] < sm) 
                 low = middle + 1;
             if(nums[middle] > sm) 
                 high = middle - 1;
         }
        return -1;     
     }
     static int[] part4(int[] nums){
         int temp;
         for (int i=0;i<15;i++){
             for (int j=0;j<15;j++){
                  if (j!=(14)){
                     if (nums[j]<(nums[j+1])){
                         temp=nums[j];
                         nums[j]=nums[j+1];
                         nums[j+1]=temp;
                     }
                 }
             }
         }
         return nums;
     }
     static int[] part5(int[] num){
         int i, j, first, temp;  
         for (i = num.length-1;i > 0;i--){  
          first = 0;  
          for(j = 1;j <= i;j ++){   
             if(num[j] > num[first])         
                 first = j;
         }
         temp = num[first]; 
         num[first] = num[i];
         num[i] = temp;
         }
         return num;
     }
     static int[] part6(int sm, int[] nums){
         int temp;
         nums[sm]=0;
         for (int count=sm;count<15;count++){
             if (count!=(14)){
                 temp=nums[count];
                 nums[count]=nums[count+1];
                 nums[count+1]=temp;
             }
         }    
         return nums;
     }
     static String input(String prompt){
      return javax.swing.JOptionPane.showInputDialog(null,prompt); }
     static void output(String message){
      javax.swing.JOptionPane.showMessageDialog(null,message); } }
