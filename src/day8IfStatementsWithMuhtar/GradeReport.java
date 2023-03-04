package day8IfStatementsWithMuhtar;

public class GradeReport {

    public static void main(String[] args) {
        /** 90-100=a
         80-89=b
         70-79=c
         60-69=d
         0-59=f
         */

        int score= 85;
        boolean a= score>=90&&score<=100;
        boolean b= score>= 80&& score<=89;
        //boolen b = >= 80&&!a// if score is a, but is greater than 80
        boolean c= score>=70&&score<=79;
        //boolean c=!b&&score>=70;
        boolean d= score>=60 && score<=69;
        boolean f = score>=0&&score<=59;
        // boolean f = !a && !b && !c && !d

        if(a) {
            System.out.println("excellent");
        }
        if (b){
            System.out.println("great");}
        if(c){
            System.out.println("good");}
        if(d){
            System.out.println("passed");}
        if (f){
            System.out.println("failed");}






    }






}
