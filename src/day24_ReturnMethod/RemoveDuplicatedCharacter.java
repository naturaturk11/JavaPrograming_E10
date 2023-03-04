package day24_ReturnMethod;

public class RemoveDuplicatedCharacter {

    public static void main(String[] args) {

        String str="aaabbdddkkdhhyyrrllmmnnueeokk";
        str=removeDuplicate(str);
        System.out.println(str);





    }

    // create a method that can remove duplciated characters from a string and returns the new value
    //					"aaabbcccc" ===> "abc

    public static String removeDuplicate(String str){//"aaaaabbc=abc

        String result=" ";
        for (int s = 0; s < str.length(); s++) {
            char each=str.charAt(s);
            if(!result.contains(each+"")){
                result+=each;
            }
        }
        return result;
    }









}
