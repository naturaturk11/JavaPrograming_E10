package day21_ArrayForEachLoop;

public class ForEachLoopPractice {

    public static void main(String[] args) {


       String[] words={ "Java Programing","Cydeo School","Wooden School","Early Birds","Angry Birds"};

       for( String each:words){


          String initials= each.charAt(0)+"."+each.charAt(each.length()-1);
          String initials2=each.charAt(0)+"."+each.charAt(each.indexOf(" ")+1);

          initials=initials.toUpperCase();
          initials2=initials2.toUpperCase();
           System.out.println(initials);//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
           System.out.println("initials2 = " + initials2);
           //!!!!!!!!!!!!!!!!!!!!!imp points: in this print one double coute were added to convert char num to string






       }









    }
}
