package day22_MultiDimensionelArrays;

public class reversedTwoWords {
    public static void main(String[] args) {


        String words="today is today is";
        String[] sentence=words.split(" ");

        String reverse1="";
        String reverse2=" ";

        for (int i = sentence[0].length() - 1; i >= 0; i--) {
            reverse1+=sentence[0].charAt(i);

        }
        System.out.println(reverse1);

        for (int i = sentence[2].length() - 1; i >= 0; i--) {
            reverse2+=sentence[2].charAt(i);
        }
           System.out.println(reverse2);

           String word1=words.replace("today",reverse1);
        System.out.println(word1);
    }
}
