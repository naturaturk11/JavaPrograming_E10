package day27_WrapperClasses;

public class WrapperClassMethod {


    public static void main(String[] args) {

      String STR1="3652";
      int num2=Integer.parseInt(STR1);
        System.out.println(num2+1);


        String str="123";

        int num=Integer.parseInt(str);
        System.out.println(num+1);//124
        System.out.println(str+16);//1231

        String str2="10.5";
       double str3= Double.parseDouble(str2);/*this is not an autobobxing or unboxing bcs to be one of both
                                              one of should be primitive the other one WrapperCLASS*/
        System.out.println(str3);
        System.out.println(str3+4);

        int max=Integer.MAX_VALUE;
        int min= Integer.MIN_VALUE;
        System.out.println(max);
        System.out.println(min);

        long max2=Long.MAX_VALUE;
        long min2=Long.MIN_VALUE;
        System.out.println("max2 = " + max2);
        System.out.println("min2 = " + min2);



        String s1="haydi";//false
        String s4="false";//false
        String s3="true";//true
        boolean s2=Boolean.parseBoolean(s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);


        System.out.println("...................................");
        //parse method converting strings to the primitives,returns primitive
        String s8="123";
        Integer x=Integer.valueOf(s8);//integer
        int y=Integer.valueOf(s8);
        System.out.println("x = " + x);
        System.out.println("y = " + y);


        //valueOfMethods= converting strings to the wrapper class objects,returns wrapper class object

       String s9="1.5";//
       Double z=Double.valueOf(s9);//double
        System.out.println("z = " + z);


        System.out.println(".........................................");

        //isDigit()
        char ch1='0';
        boolean isDigit=Character.isDigit(ch1);
        System.out.println(isDigit);

        char ch2='A';
        boolean isDigit1=Character.isDigit(ch2);
        System.out.println(isDigit1);
        
        //isLetter
        char ch3='A';
      boolean ch4= Character.isLetter(ch3);
        System.out.println("ch4 = " + ch4);

        char ch5='!';
       boolean t1 =Character.isLetterOrDigit(ch5);
        System.out.println("t1 = " + t1);





        char char1='a';
        boolean t2=Character.isUpperCase(char1);
        System.out.println("t2 = " + t2);
       
        char char2='a';
        boolean t3 =Character.isLowerCase(char2);
        System.out.println("t3 = " + t3);


        System.out.println("................................................");

        String str6="ab1cd2efgh4";
        int sum=0;
        for (char each : str6.toCharArray()) {
            if(Character.isDigit(each)){
                sum+=Integer.parseInt(""+each);
            }
        }
        System.out.println(sum);
        
    }










}
