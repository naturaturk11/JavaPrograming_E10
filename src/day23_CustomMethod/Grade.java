package day23_CustomMethod;

public class Grade {
    public static void main(String[] args) {

        grade(100);




    }
    public static void grade(int score){
      if(score>=0&&score<=100){
          String grade=(score>=90)?"Excellent":(score>=80)?"great":(score>=70)?"good":(score>=60)?"passed":"try it again";
          System.out.println(grade);
      }else {
          System.out.println("Your score is invalid!...Please recheck the knowledge ");
      }




    }





}
