package day15ForLoop;

public class JavaPythonNumbers {

    public static void main(String[] args) {
        /*Use a `loop` to count how many times the characters `java` and `python` are found
         in the given String `sentence`. Output `true` if `java` and `python` appear the same
         number of times, otherwise output `false`.
         */

        String words = "we study python java notjava python";
        words = words.toLowerCase();
        int javaCount = 0;
        int pythonCount = 0;


        for (int i = 0; i <= words.length() - 4; i++) {

            String a = words.substring(i, i + 4);
            a=a.toLowerCase();
            if(a.equals("java")){
                javaCount++;
            }

        }
        for (int i = 0; i <= words.length() - 6; i++) {

            String b = words.substring(i, i + 6);
            b=b.toLowerCase();
            if (b.equals("python")){
                pythonCount++;
            }



        }


        String f="halateyzehfyfhhalateyze";
        int countTeyze=0;
        int countHala=0;

        for (int i = 0; i <f.length()-4 ; i++) {
           String h =f.substring(i,i+4);
           if(h.equals("hala")){
               countHala++;
           }
        }

        for (int l = 0; l <f.length()-5 ; l++) {
            String t=f.substring(l,l+5);
            if(t.equals("teyze")){
                countTeyze++;
            }
        }

        System.out.println("countHala = " + countHala);
        System.out.println("countTeyze = " + countTeyze);


        boolean e=countTeyze==countHala;
        System.out.println("e = " + e);


        boolean c = pythonCount == javaCount;
        System.out.println(c);

}}
















