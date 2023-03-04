package day14String2;

public class EmailDomain_Substring {
    public static void main(String[] args) {

        String email="Cydeo.School@gmail.com";
        //:domain:gmail is located between @ and .

        int beginningIndex=email.indexOf("@")+1 ;
        int endingIndex= email.lastIndexOf(".");

        String domain =email.substring(beginningIndex , endingIndex);
        System.out.println("domain = " + domain);



        System.out.println("......................................................");

        String str1="Java is fun, Java is cool, I love Java";
        //           0123456789
        String s1=str1.substring(0 ,10+1);//Java is fine
        System.out.println(s1);

        int beg=str1.indexOf(" J")+1;

        int end=str1.lastIndexOf(",");


        String s2=str1.substring(beg, end);//Jav is cool

        System.out.println(s2);

        String s3=str1.substring(str1.lastIndexOf("I"));
        System.out.println(s3);//I love java
        
        String d=" this is not first achievement";
        char v=d.charAt(1);
        char v1=d.charAt(d.length()-1);

        int begg=d.indexOf("n");
        int endd=d.lastIndexOf("f");
        String sagre=d.substring(begg,endd);
        System.out.println("v = " + v);
        System.out.println("v1 = " + v1);

        System.out.println("begg = " + begg);
        System.out.println("endd = " + endd);
        System.out.println("sagre = " + sagre);
        



    }



}
