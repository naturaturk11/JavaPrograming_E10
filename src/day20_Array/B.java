package day20_Array;

public class B {
    public static void main(String[] args) {


        String[] classmates= {"ali ka","aysel de","halil çe","kerem ye","yusuf pe","hakkı ka",
                "emel ze","kamil ne","emre od","hasan sa"};


        for (String classmate : classmates) {
            String reversed="";

            for (int i = classmate.length()-1; i >= 0; i--) {
                reversed+=classmate.charAt(i);
            }
            System.out.println("reversed = " + reversed);
        }





    }
}
