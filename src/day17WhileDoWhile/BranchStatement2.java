package day17WhileDoWhile;

public class BranchStatement2 {

    public static void main(String[] args) {


        for (char i = 'A'; i <= 'E'; i++) {
             if(i=='C'){
                continue;//means to skip
             }
            System.out.print(i);//A B
        }

        System.out.println("...........................................");

        for (int i = 1; i <=10 ; i++) {//12345678910

            if(i%2 !=0) {//13579
                continue;//skip

            }
            System.out.print(i);//2 4 6 8 10

        }


        System.out.println("...................................................");

        for (int i = 1; i <=10 ; i++) {
            if(i%2==0){
                continue;
            }
            System.out.print(i);
        }

        }
        
        
        
        
        
        }







