package day24_ReturnMethod;


public class ReturnStatementTask2 {
    public static void main(String[] args) {
        nameOfMonth(12);



    }



    //3. Create a method that can display the name of the month based on the given number to the method

    public static void nameOfMonth(int number){
        String nameofMonth="";
        //return method is used in void on condition that the return is used to exit

       if(number<1 ||number>12){
           System.out.println("Invalid");
           return;//exits if the number out of range

       }
            nameofMonth= (number==1)?"jan":(number ==2)?"feb":(number ==3)?"mach":(number==4)?"april":
                    (number==5)?"may":(number==6)?"jun":(number==7)?"july":(number==8)?"augst":(number==9)?"sep":
                            (number==10)?"oct":(number==11)?"nov":"dec";



        System.out.println("nameofMonth = " + nameofMonth);
    }

}
