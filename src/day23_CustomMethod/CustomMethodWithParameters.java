package day23_CustomMethod;

public class CustomMethodWithParameters {

    public static void main(String[] args) {

        oddOrEvenNumbers(9);//method demands additional info
        ageOfPerson(1981);

        printNumber(1000,2000);

    }







    // create a function that can check if a number is odd or even number

    public  static void oddOrEvenNumbers(int number){
       if(number %2==0){
           System.out.println(number+" is even number");
       }else {
           System.out.println(number+" is odd number");
       }

    }

    //create a function that can display the age of the person

    public  static void ageOfPerson(int birthYear){
        int age =2021-birthYear;
        System.out.println("your age is :"+age);

    }

    //create a function that can print all the numbers between x and y
      public static void printNumber(int x,int y){
         int numbers=0;
        for (int i = x; i <=y ; i++) {
            if(x<=y){
                numbers++;
                System.out.println(numbers);
            }else{
                System.out.println("Invalid");
            }




          }

      }

}
