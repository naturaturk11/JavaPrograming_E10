package day20_Array;

public class UniqueCharacter {
    public static void main(String[] args) {

        char[] chars={'A','B','A','B','C','D','E','D'};


        for (int j = 0; j < chars.length; j++) {
                        //!!!!
            char ch=chars[j];
            //char ch=chars[0];this used assignment in first step convert to second step by changing indexes of "0" to "j"
            int frequency=0;

            for (int i = 0; i < chars.length; i++) {
                if(chars[i]==ch){
                    frequency++;
                }
            }
            if(frequency==1){
                System.out.print(ch+" ");
        }







    }
}}
