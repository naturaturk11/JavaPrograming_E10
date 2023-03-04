package day15ForLoop;

public class FrequencyQuest {
    public static void main(String[] args) {

        /*Write a program that asks user to enter a string and a char,
        the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4*/

        String str = "aabcccd";
        char  a= 'c';
        int count=0;

        for (int i = 0; i <str.length()-1 ; i++) {
            char ch=str.charAt(i);
            if(ch=='c')
            count++;

        }
        System.out.println(count);








    }
}
