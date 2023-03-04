package basics;

import java.util.ArrayList;
import java.util.Arrays;

public class SeperationOfWords {

    public static void main(String[] args) {

     String[] a={"akhddhd12254=)(ASJS","alim29?"};
        System.out.println("Arrays.toString(a) = " + Arrays.toString(a));

        ArrayList<String>list=new ArrayList<>(Arrays.asList(a));
        System.out.println("list = " + list);

       char[] b=list.get(1).toCharArray();
        System.out.println(Arrays.toString(b));
         String letters="";
         String digits="";
         String specCh=" ";


        for (char each : b) {
            if(each>='a'&& each<='z'){
                letters+=each;
            } else if (each>='A'&&each<='Z') {
                letters+=each;
            } else if (each>='0' && each<='9') {
                digits+=each;
            }else {
                specCh+=each;
            }


        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specCh = " + specCh);
    }
}
