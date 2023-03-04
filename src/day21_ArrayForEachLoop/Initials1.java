package day21_ArrayForEachLoop;

public class Initials1 {
    public static void main(String[] args) {
        String[] words={ "Java Programing","Cydeo School","Wooden School","Early Birds","Angry Birds"};

        for (String each : words) {

            System.out.println(each.charAt(0)+""+each.charAt(each.length()-1));

        }

        System.out.println("....................................................................");

        for (String each1 : words) {
            System.out.println(each1.charAt(0)+""+each1.charAt(each1.indexOf(" ")+1));
        }

        System.out.println(".......................................................................");












    }
}
