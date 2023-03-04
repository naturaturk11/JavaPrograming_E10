package day20_Array;

public class CommonLetters {
    public static void main(String[] args) {

        char[]letter1={'a','b','c','d','e'};
        char[]letter2={'e','r','s','a','b'};

        for (int i = 0; i < letter2.length; i++) {
            for (int j = 0; j < letter1.length; j++) {
                if(letter1[j]==letter2[i]){
                    System.out.print(letter1[j]+" ");
                }
        }

        }



    }
}
