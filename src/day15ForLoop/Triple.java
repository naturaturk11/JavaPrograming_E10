package day15ForLoop;

public class Triple {
    public static void main(String[] args) {

        /*Use a `loop` to count the number of triples in the given `str`.
        A triple is when the same character appears three times in a row. So if there is a specific
        character that is repeated three times, that will be counted as one triple. Print the total
         number of triples found in the String. The triples may overlap.
         */

          String words="xxxyyyxfrzzz";
          int countSpecialch=0;
          String triple="";


        for (int i = 0; i <=words.length()-3 ; i++) {
            triple=words.substring(i,i+3);
            if(triple.charAt(0)==triple.charAt(1)&& triple.charAt(1)==triple.charAt(2)&&triple.charAt(0)==triple.charAt(3)){
                countSpecialch++;
            }

        }
        System.out.println("countSpecialch = " + countSpecialch);



    }
}
