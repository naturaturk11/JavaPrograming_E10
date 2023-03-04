package day15ForLoop;

public class Frequency {
    public static void main(String[] args) {

        /*Write a program that asks user to enter a string and a char, the returns the frequency of the char from
        the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3*/


        String s="aa22bccccd";
        char n='a';
        int count=0;

        for (int i = 0; i <s.length() ; i++) {

            char ch=s.charAt(2);//it "ch"is only the index of 2
            char each=s.charAt(i);//this" each" symbolizes the full indexes
            if(ch==each){
                count++;
            }



        }
        System.out.println(count);



        String d="aknfhfdgfgkgıgjhfdk456dfkjf";
        int frequency=0;
        char w='a';
       int unigCh=0;


        for (int l = 0; l < d.length(); l++) {
            char ch=d.charAt(3);
            char each=d.charAt(l);
            if(ch==each){
                frequency++;
            }
            if(ch!=each){
                unigCh++;
            }

        } System.out.println("frequency = " + frequency);
        System.out.println("unigCh = " + unigCh);


    }
}
