package day16ForLoopStringPractice;

public class RemovingDeplucates {


    public static void main(String[] args) {
/*write a program that can remove the duplication characters from a string
        ex:
        input:AABBCCBC

        output: ABC

    HİNT: you can add each character of the string in to another string


*/
 String str="aabbcc";
 String result="";//"abc"
                     // i<=7====>i<8
        for(int i=0;i<=str.length()-1;i++){//i:represents the all index numbers of the str(starts from 0)
            //char ch= str.charAt(i);//represents each Character of str+char were to string by adding ""
            String ch="" +str.charAt(i);
            if(!result.contains(ch)){//if the character is not contained in the result
                result+=ch;//the character will be added to the result
            }



    }

        System.out.println("result = " + result);

}}
