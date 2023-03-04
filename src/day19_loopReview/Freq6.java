package day19_loopReview;

public class Freq6 {
    public static void main(String[] args) {



        String str="hfkfhsuurmflgpttkggmmss";

        String result="";

        for (int i = 0; i <str.length() ; i++) {

            char ch=str.charAt(i);
           int count=0;

            for (int j = 0; j <str.length() ; j++) {

                char each=str.charAt(j);

                if(each==ch){
                    count++;
                }


            }
            if(result.contains(""+ch)){
               continue;
            }
            result+=ch;
            result+=count;

        }
        System.out.println(result+" ");
    }
}
