package day15ForLoop;

public class ShapePractice {
    public static void main(String[] args) {


        String a = "Robert Down Junior";
        a = a.replace(" ", ".");
        System.out.println(a);
        a = a.substring(0, 1) + "." + a.substring(7, 8) + a.substring(a.lastIndexOf("."));

        System.out.println(a);


        int sum = 0;
        int a1 = 10;
        for (int i = 1; i <= a1; i++) {
            sum += i * (i + 1);

        }
        System.out.println(sum);

        int b = 0;
        for (int i = 1; i < 6; i++) {
            System.out.println("*".repeat(i));
        }

        for (int l = 0; l <10 ; l++) {
            System.out.println("*".repeat(l));
        }
        for (int i = 10; i >=1 ; i--) {
            System.out.println("*".repeat(i));
        }
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i*(i));
        }

    }
















    }

