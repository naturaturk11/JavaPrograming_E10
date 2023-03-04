package day14String2;

public class EmailTask2 {
    public static void main(String[] args) {


        String email="hasan_sadeb@gmail.com";


        String firstName=email.substring(0,email.indexOf("_"));
        String lastName=email.substring(email.indexOf("_")+1,email.indexOf("@"));
        String domain=email.substring(email.indexOf("@")+1,email.indexOf("."));

        System.out.println("First name:"+firstName);
        System.out.println("Last name:"+lastName);
        System.out.println("Domain:"+domain);




    }
}
