package day20_Array;

public class AppearedTwice {
    public static void main(String[] args) {

        char[] chars={'A','B','A','B','C','D','D'};

        //second step
        for (int j = 0; j < chars.length; j++) { /*!!!!this is formula of one whole elements' ferquency which contains inner loop
                                                  by changing the j in char ch=chars[j]; instead of char ch=chars[0];*/



            char ch=chars[j];//'A'

            int frequency=0;


        //first step
        for (int i = 0; i < chars.length; i++) { //!!!!this is formula of one element frequency
                if(chars[i]==ch){
                    frequency++;
        }



       /* for (int i = 0; i < chars.length; i++) { !!!!this is formula of one element frquency
            if(chars[i]==ch){
                frequency++;*/
            }
        if(frequency==2){
            System.out.print(ch);
        }

        }




    }
}
