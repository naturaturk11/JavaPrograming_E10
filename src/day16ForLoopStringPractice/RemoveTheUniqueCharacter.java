package day16ForLoopStringPractice;

public class RemoveTheUniqueCharacter {
    public static void main(String[] args) {
        /*write aprogram that can return the unique characters from a String

        ex:
        input: AABCCD

        OUTPUT:BD
        HİNT: you will index of ()and lastindex()
        if the first and last index numbers of the character are same , then it is unique

*/
  String str="aaabccddddnhlhHc";
  String result="";

  for(int i=0;i<=str.length()-1;i++){//i: index numbers of str(starting from 0
        str=str.toLowerCase();
      char ch=str.charAt(i);

     if(str.indexOf(ch)==str.lastIndexOf(ch)){/*if the first and last index numbers of the character are same
                                                then the  character must be unique
                                           */
      result+=ch;}

      /*if(!result.contains(""+ch)){this is remove duplication method
          result+=ch;
      }*/

  }

        System.out.println("result = " + result);




    }
}
