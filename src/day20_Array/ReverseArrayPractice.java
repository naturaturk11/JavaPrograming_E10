package day20_Array;

public class ReverseArrayPractice {
    public static void main(String[] args) {


        String[] classmates= {"ali ka","aysel de","halil çe","kerem ye","yusuf pe","hakkı ka",
                "emel ze","kamil ne","emre od","hasan sa"};
        for (String classmate : classmates) {
            String reversedinitial="";
            for (int i = classmate.length()-1; i >=0 ; i--) {
              reversedinitial=  classmate.substring(0,1).toUpperCase()+"."+classmate.substring(classmate.indexOf(" ")+2).toUpperCase();

            }
            System.out.println("reversedinitial = " + reversedinitial);


        }

    }}

