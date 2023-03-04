package day24_ReturnMethod;

public class ReturnMethodPractice {
    public static void main(String[] args) {



        //find the max number btw 100-200
        int maxNumbers=max(100,200);
        System.out.println(maxNumbers);





        //multiply the max number by 2

         int multiplication=maxNumbers*2;
        System.out.println(multiplication);

    }

    public static int max(int a,int b){

        int result=0;
        if(a>b){
            result = a;
        }else{
            result=b;
        }

        return result;


    }






}
