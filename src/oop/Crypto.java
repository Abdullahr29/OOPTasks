package oop;

 public class Crypto {
     public Crypto(){}
     String encrypt(String line){
         String encrypted="";
         for(int count=0;count<line.length();count++){
             if (line.substring(count, count+1).equals("v")||line.substring(count, count+1).equals("V"))
                 encrypted=encrypted+("ag',r");
             else if (line.substring(count, count+1).equals("m")||line.substring(count, count+1).equals("M"))
                 encrypted=encrypted+("ssad");
             else if (line.substring(count, count+1).equals("g")||line.substring(count, count+1).equals("G"))
                 encrypted=encrypted+("jeb..w");
             else if (line.substring(count, count+1).equals("b")||line.substring(count, count+1).equals("B"))
                 encrypted=encrypted+("dug>?/");
             else
                 encrypted=encrypted+(line.substring(count, count+1));    
             }
         return encrypted;
     }
     String decrypt(String line){
         String decrypted="";
         for(int count=0;count<line.length();count++){
             if (line.substring(count, count+5).equals("ag',r")){
                 decrypted=decrypted+("v");
                 count=count+4;
             }    
             else if (line.substring(count, count+4).equals("ssad")){
                 decrypted=decrypted+("m");
                 count=count+3;
             }    
             else if (line.substring(count, count+6).equals("jeb..w")){
                 decrypted=decrypted+("g");
                 count=count+5;
             }    
             else if (line.substring(count, count+6).equals("dug>?/")){
                 decrypted=decrypted+("b");
                 count=count+5;
             }    
             else
                 decrypted=decrypted+(line.substring(count, count+1));
         }
         return decrypted;
     }
 }
