package day14String2;

public class StringMethod2 {
    public static void main(String[] args) {
        String str= "Java is fun,I love Java";
        String str2=str.replace("Java" , "Python");//
        System.out.println("str2 = " + str2);
        System.out.println("str = " + str);

        String email= "johnSmith@yahoo.com";
        email=email.replace("yahoo" , "gmail");


        System.out.println("email = " + email);

        String sentence= "Java Java Java Python Python C+ C++ C+++ Python Python ";
        String sentence1=sentence.replace("Python" , "").replace("    " , " ")
                .replace("  " , "");

        System.out.println("sentence = " + sentence);
        System.out.println("sentence1 = " + sentence1);


        String s6=" Hello world again I came again";
        System.out.println("s6 = " + s6);
        s6= s6.replace(" again " , " repeatly ");
        System.out.println("s6 = " + s6);


        System.out.println(".....................................................");

        String a1=" hey hey ehey hey ukey";
        System.out.println(a1);
        a1.replace("hey" , "voww");
        a1=a1.replace("hey" , "voww");
        System.out.println(a1);
        String a2=" hey hey ehey hey ukey";
        System.out.println(a2);
        a2=a2.replaceFirst("hey" , "yuppii");
        System.out.println("a2 = " + a2);

        String a6="book";
       a6= a6.replaceFirst("b" , "t");
        System.out.println("a6 = " + a6);

      String h= "Java";
      h=h.replaceFirst("av", "va");
        System.out.println("h = " + h);










        String o="carpet";
  o=o.replace("c", "C");
        System.out.println("o = " + o);
      String u="nachsclagen";
      u=u.replace("n", "N").replace("a", "A").replace("c", "&");
        System.out.println("u = " +u);






    }




}
