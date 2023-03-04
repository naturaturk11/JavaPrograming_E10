package day14String2;

public class StringMethod1 {

    public static void main(String[] args) {

       String str1="       batch 25    ";
       str1.trim();//"batch 25"....are not same with previous String
       str1=str1.trim();
        System.out.println(str1);//after assigned a new string with no white space(unused space)


        System.out.println("..............................................");

         String  str2= "Cydeo School";

        int n1=str2.indexOf("h");

        System.out.println("n1 = " + n1);
        int n2=str2.indexOf("ool");
        System.out.println("n2 = " + n2);

        String str3="Java programming language";
         int n3=str3.indexOf("a");
        System.out.println("n3 = " + n3);
        int n4= str3.indexOf("a ");
        System.out.println("n4 = " + n4);
        int n5=str3.indexOf("am");
        System.out.println("n5 = " + n5);
        int n6=str3.indexOf("uag");



        System.out.println("n6 = " + n6);
        int n7=str3.lastIndexOf("g");
        System.out.println("n7 = " + n7);
        int n8=str3.lastIndexOf("ng");
        System.out.println("n8 = " + n8);
        int n9=str3.lastIndexOf("av");
        System.out.println("n9 = " + n9);
        int thirdA=str3.indexOf("ra");
     System.out.println("thirdA = " + thirdA);
     int s1=str3.lastIndexOf("g l");
     System.out.println("s1 = " + s1);

     int l=str3.indexOf("va");
     System.out.println("l = " + l);

    }



}
