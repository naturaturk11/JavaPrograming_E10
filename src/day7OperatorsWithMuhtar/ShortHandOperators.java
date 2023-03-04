package day7OperatorsWithMuhtar;

public class ShortHandOperators {

    public static void main(String[] args) {


        //assignment :=
        int number= 100;
        System.out.println("number = " + number);//100


        number= 200;
        System.out.println("number = " + number);//200
        
        String word="Java Programing";

        System.out.println("word = " + word);
        word="Wooden Spoon";//variable was changed afer this time new variable will be used
        System.out.println("word = " + word);
        word= "hello";
        System.out.println("word = " + word);
        word= "java Programing";
        System.out.println("word = " + word);

        System.out.println(" .......................................................");

        //addition assignment is  used for also string but others not
        int x=100;
        System.out.println("x = " + x);
        System.out.println(x+200);
        x=x+200;
        System.out.println(x);

        String str="Wooden";
        str+=" Spoon";
        System.out.println(str);


        double availableBalance= 1000.50;
        //deposit 300$
        availableBalance+= 300;//availablebalance= 100.50+300
        System.out.println(availableBalance);//1300.5


        System.out.println(".............................................");

        availableBalance -=500;// available =1300.5-500
        System.out.println(availableBalance);
        //withdrowing 200$, then then depositing 400$

        availableBalance-=200;
        availableBalance +=400;
        System.out.println(availableBalance);
        System.out.println(".............................................");


        double salary= 50000.50;//if wanted to make double
        salary*=2;//first multiply and then assigned,
        System.out.println(salary);

        double dodge=0.00000001;
        dodge *=1000000;
        System.out.println(dodge);

        System.out.println(".............................................");
        double num2=25000;
        num2/=2;//num2/2...if wanted num2 will be reduced to half
        System.out.println(num2);

        System.out.println(".............................................");

        //Rmainder

        double num3=100;
        //%=100/3

        num3 %=3;
        System.out.println(num3);


        System.out.println(".............................................");



        int amount =127;//cents
        int quarters =amount/25;
        int cents=amount%25;
        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

        System.out.println(".............................................");

        int cents2= 127;
        cents2%=25;
        System.out.println("cents2 = " + cents2);

        System.out.println(".............................................");


        int balanca=3500;
        //insurancefee:$153

        balanca %=153;
        System.out.println("balanca = " + balanca);






























    }






}
