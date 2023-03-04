package day15ForLoop;

public class ForLoopAlphabet {
    public static void main(String[] args) {
        //A-Z 65-90numbers were obtained from "ASCI" table".
        for (int i=65; i<91;i++){
            //System.out.print(i+" "); //integer result was reached
            System.out.print((char)i+" ");//the alphabet in char were resulted
        }

        System.out.println();

        for(char i='A';i<='Z';i++){
            System.out.print(i+" ");
        }
        System.out.println();
        //a-z
        for(char i='a';i<='z';i++){
            System.out.print(i+" ");

        }

        System.out.println();

    for(char i='Z';i>='A';i--){
        System.out.print(i+" ");
    }
        System.out.println();
        for(char i='z';i>='a';i--){
            System.out.print(i+" ");}
            System.out.println("...............................................................");


            System.out.println();


            for(char i=1;i<=40000;i++ ){
                System.out.print(i+" ");





    }}}
