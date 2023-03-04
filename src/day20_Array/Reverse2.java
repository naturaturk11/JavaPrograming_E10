package day20_Array;

public class Reverse2 {
    public static void main(String[] args) {
        String[] classmates= {"ali ka","aysel de","halil çe","kerem ye","yusuf pe","hakkı ka",
                "emel ze","kamil ne","emre od","hasan sa"};


        for (String each : classmates) {
            String reversed="";

            for (int i = each.length() - 1; i >= 0; i--) {
                reversed+=each.charAt(i);
        }
            System.out.println(reversed);

        }







    }
}
