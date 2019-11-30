package oop;

 import javax.swing.JOptionPane;
 public class OOPTester2 {
     public static void main(String regs[]){
         CheckAccount acc1= new CheckAccount("2949","Awesome Abdullah",100);     
         acc1.display();
         acc1.deposit(2000);
         acc1.cheque(1500);
         acc1.display();
        
         CheckAccount acc2=  new CheckAccount("007","James Bond",50000);
         acc2.display();
         acc2.deposit(70000);
         acc2.cheque(10000);
         output(""+acc2.getCurrentBalance());
         acc2.display();
                
                
    }
    
    
    
    
    
    
    static void output(String message)
    { JOptionPane.showMessageDialog(null,message); }  
}

