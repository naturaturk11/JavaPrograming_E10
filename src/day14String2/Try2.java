package day14String2;

public class Try2 {
    public static void main(String[] args) {

 String s="hallo world";
 String s1="hallo world";
 String s2="hallo world";
 String s3=" HALLO world";
        System.out.println(s==s1);
        System.out.println(s1==s3);
        System.out.println(s1==s2);
 String a=new String("hallo world");
 String a1=new String("hallo world");
        System.out.println(a==s);
        System.out.println(s2==a1);

        String str="Java";
        String str2=new String("Java");
        System.out.println(str2==str);
        System.out.println(str.equals(str2));

        System.out.println(".......................................................");

        String sixteenthWord="hallo alle leute, ist es sehr schön dich zu sehen";
        char word=sixteenthWord.charAt(13);
        System.out.println(word);
        int totalChar=sixteenthWord.length()-1;
        System.out.println(totalChar);

        char lastChar=sixteenthWord.charAt(sixteenthWord.length()-1);
        System.out.println(lastChar);

        String fullName="brett PİTT";
        String b1=fullName.toUpperCase();
        System.out.println(b1);















    }






}
