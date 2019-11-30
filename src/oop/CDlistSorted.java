package oop;

/**************************************************
After adding more CD titles, Joe decided he would like to see
an alphabetical (sorted) list of the titles, so he could browse
through looking for favorite CDs, rather than typing titles.
Now the program starts by sorting and printing the array,
and then inputs search requests. In the real program,
he has a lot more titles.
***************************************************/
public class CDlistSorted
{
  String[] titles = {"Cafe del Mar 18",
    "Valtari",
    "Nature One",
    "Swagg",
    "Netsky 2",
    "DJ Kicks",
    "Trouble"
  };
  
  public CDlistSorted()
  {
    sortList();
    printList();
    String name = "";
    do
    {
      name = input("Type the name of the CD");
      search(name);
    } while(name.length() > 0);   // type nothing to quit
  }
  
  void sortList()   // an ineffient BubbleSort algorithm
  {
    for(int pass = 0; pass < titles.length; pass = pass + 1)
    {
      for(int x = 0; x < titles.length-1; x = x+1)
      {
        if(titles[x].compareTo(titles[x+1]) < 0)
        {
          String first = titles[x];     // swapping neighbors
          String second = titles[x+1];
          titles[x] = second;
          titles[x+1] = first;
        }       
      }
    }
  }
  
  void printList()
  {
    for(int c = 0; c < titles.length; c=c+1)
    {
      System.out.println(titles[c]);
    } 
    System.out.println("========");
  }

  void search(String name)
  {
    for(int c = 0; c < titles.length; c=c+1)
    {
      if( titles[c].equals(name) )
      {
        output("Found " + name);
        return;                   // quits if name is found
      }  
    }
    output("Not found - you don't own that"); 
  }
  
  public static void main(String[] args)
  {  new CDlistSorted();  }
  
  public String input(String prompt)
  { return javax.swing.JOptionPane.showInputDialog(null,prompt); }
  
  public void output(String message)
  {  javax.swing.JOptionPane.showMessageDialog(null,message);  }
}
