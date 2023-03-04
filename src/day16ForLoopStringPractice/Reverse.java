package day16ForLoopStringPractice;

public class Reverse {
    public static void main(String[] args) {



        /*write a program input:Wooden Spoon, output:noopS nedooW*/
String str="Wooden Spoon";
String result="";
//noopS nedooW

       result+=str.charAt(11);//n
        result+=str.charAt(10);//o
        result+=str.charAt(9);//o
        result+=str.charAt(8);//p
        result+=str.charAt(7);//S
        result+=str.charAt(6);//''
        result+=str.charAt(5);//n
        result+=str.charAt(4);//e
        result+=str.charAt(3);//d
        result+=str.charAt(2);//o
        result+=str.charAt(1);//o
        result+=str.charAt(0);//W 
        System.out.println("result = " + result);
        //for the best alternative for string to reverse for loop is the best


        for(int i=str.length()-1;i>=0;i--){//i: index numbers of str(starting last index to index 0)
        
        
        result+=str.charAt(i);}//+= adding each character int the result

        System.out.println("result = " + result);


     System.out.println(".........................................................................");

     String name="Hasan SADEBIYIK";
     String result1="";

     for (int i = name.length()-1; i >=0 ; i--) {
      
      result1+=name.charAt(i);
      
     }
     System.out.println("result1 = " + result1);
     
     
     
     
     
     

    }
}
