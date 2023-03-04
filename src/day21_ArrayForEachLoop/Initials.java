package day21_ArrayForEachLoop;

public class Initials {
    public static void main(String[] args) {

        /* 1. create an array named classmates, and store 10 of your classmates'
full names
print the initials of each classmates in separate lines*/



        String[] classmates= {"ali ka","aysel de","halil çe","kerem ye","yusuf pe","hakkı ka",
                "emel ze","kamil ne","emre od","hasan sa"};



        for (String each : classmates) {

           String initial=each.charAt(0)+"."+each.charAt(each.indexOf(" ")+1);
           initial=initial.toUpperCase();
            System.out.println(initial);

        }





    }
}
