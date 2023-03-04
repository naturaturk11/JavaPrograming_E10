package day16ForLoopStringPractice;

public class UniqueCharacter {

    public static void main(String[] args) {



        String a="hdmlfjufnfıfnKHFUFSFJIDkfgjmfgkkiatyufgkgnslödfşlo";
        String result=" ";

        for (int i = 0; i <a.length()-1 ; i++) {
            a=a.toLowerCase();
            String ch=""+a.charAt(i);

            if(a.indexOf(ch)==a.lastIndexOf(ch)){
                result+=ch;

            }


        }
        System.out.print(result+" ");




    }
}
