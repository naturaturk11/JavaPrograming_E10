package day13StringClass;

public class NewClass {
    public static void main(String[] args) {
        String m=" the person";
        int d1=m.charAt(0);
        int d2=m.charAt(m.length()-1);

        if (d1 == d2) {
            System.out.println("same");
        } else {
            System.out.println("not matched");
        }



    }
}
