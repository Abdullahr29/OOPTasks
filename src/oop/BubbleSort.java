package oop;

public class BubbleSort
{
  public BubbleSort()
  {
    makeNumbers();
    showNumbers();
    bubbleSort();
    showNumbers();
    checkSorted();
  }
  int[] nums = new int[100000000];
  int howMany = 0;
  
  void makeNumbers()
  {
    howMany = inputInt("How many numbers do you want?");
    for(int c = 0; c < howMany; c = c+1)
    {
      nums[c] = c; 
    }
    for(int c = 0; c < howMany; c = c+1)    // scramble up nums
    {
      int a = (int)(Math.random()*howMany);
      int b = (int)(Math.random()*howMany);
      int temp = nums[a];
      nums[a] = nums[b];
      nums[b] = temp; 
    }
  }
  
  void bubbleSort()
  {
    for(int pass = 0; pass < howMany; pass++)
    {  for(int c = 0; c < howMany - 1; c++) 
      {  
      if(nums[c] > nums[c+1])
      { int temp = nums[c];
        nums[c] = nums[c+1];
        nums[c+1] = temp;
      }
    }
    }
  }
  
  void showNumbers()
  {
     String all = "";
     for (int c=0; c < howMany; c++)
     {
        all = all + nums[c] + "\n"; 
     }
     output(all);
  }
  
  void checkSorted()
  {
    for(int c = 0; c < howMany; c = c+1)
    {
      if(nums[c] != c)
      { output("Failed at position " + c + " = " + nums[c]); 
        return;
      }
    } 
    output("Success!");
  }
  
  public static void main(String[] args)
  {  new BubbleSort(); }
  
  public void output(String message)
  {  javax.swing.JOptionPane.showMessageDialog(null,message);  }
  
  public String input(String prompt)
  {  return javax.swing.JOptionPane.showInputDialog(null,prompt);  }
  
  public int inputInt(String prompt)
  {  int result=0;
    try{result=Integer.valueOf(
        input(prompt).trim()).intValue();}
    catch (Exception e){result = 0;}
    return result;
  }
}
/**
 * Answers
 * (1) -----
 * (2) This is because firstly each position is moved to its correct position in terms of its size.
 *      Then the same has to be done for all the other positions so another loop is required. 
 * (3) How Many             How Long (seconds)            
 *     --------             -----------------
 *     1000                 43     
 *     4000                 error
 *     16000                error
 *     64000                error
 *     256000               error
 * (4)  ummm what...
 *      
 *   
 * 
 * (5) 
 *     
 *      
 *      
 * (6) 
 *     
 *  
 * 
 * (7)
 * 
 * 
 * 
 */