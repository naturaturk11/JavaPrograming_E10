package day14String2;

public class Email3 {

    public static void main(String[] args) {
        String name="one two one two ";
        String email="nerede12?A@gmail.com";
        String digits=email.substring(email.indexOf("1"),email.indexOf("2")+1);
        String lovercase=email.substring(0,email.indexOf("1"));
        String a=email.substring(email.lastIndexOf("c"));
        name=name.replace("one","F");
        name=name.toUpperCase();







        System.out.println(digits);
        System.out.println(lovercase);
        System.out.println(a);
        System.out.println(name);
        System.out.println(name);








    }
}
