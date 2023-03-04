package day17WhileDoWhile;

public class LoopPractices {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);


            System.out.println("..........................................................");


            int j = 1;
            while (i <= 10) {

                System.out.println(j);//2
                j++;//iterater should be end
            }

            System.out.println("........................................");


            int k=1;
            do{
                System.out.println(k);
                k++;//iter should be here located

            }while (k<=10);







        }










    }
}