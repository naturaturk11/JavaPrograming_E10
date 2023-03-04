package day24_ReturnMethod;

public class Reverse1 {
    public static void main(String[] args) {
        String str = "Java";
        reverse(str);




    }
    /* create a method named reverse that passes one string parameter, the method can return
    the reversed string

				Ex:
					str = "Java";

					reverse(str) ==> avaJ


    */
    public static String reverse(String str){

        String reverse="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse+=str.charAt(i);
        }
        System.out.println(reverse);


      return reverse;

    }




}
