package day24_ReturnMethod;

public class WarmUpTest {
    public static void main(String[] args) {

        /*Warmup tasks:









    */
         initial("Hasan","sadebıyık");
        System.out.println(".........................................................");
         domain("hasan11@gmail.com");

         String[] emails={"kushdy@melek.com","jjgjjgfk@cydeo.com","hasan11@gmail.com"};
        for (String email : emails) {
            domain(email);
        }

        nameOfMonth(12);
        nameOfDays(6);




    }
    //1. Create a method that can display the initials of the person
    public static void initial(String firstName,String lastName){
        firstName=firstName.toUpperCase();
        lastName=lastName.toUpperCase();
        System.out.println(firstName.charAt(0)+"."+lastName.charAt(0));





    }


    //2. Create a method that can display the domain of the email
     public static void domain(String email){
       String  domain=email.substring(email.indexOf("@")+1,email.indexOf("."));
         System.out.println(domain);


     }

     //3. Create a method that can display the name of the month based on the given number to the method

     public static void nameOfMonth(int number){
         String nameofMonth="";
         if(number>=1 && number<=12){
             nameofMonth= (number==1)?" jan":(number ==2)?"feb":(number ==3)?"mach":(number==4)?"april":
                     (number==5)?"may":(number==6)?"jun":(number==7)?"july":(number==8)?"augst":(number==9)?"sep":
                             (number==10)?"oct":(number==11)?"nov":"dec";


         }else
             nameofMonth="invalid";
         System.out.println("nameofMonth = " + nameofMonth);
     }

     //4. Create a method that can print the name of the day based on the given number to the method

    public static void nameOfDays(int day){
        String nameOfday="";
        if(day>=1 && day<=7 ){
          nameOfday=(day==7)?"Sunday":(day==1)?"Monday":(day==2)?"Tuesday":(day==3)?"Wednsday":
                  (day==4)?"Thursday":(day==5)?"Friday":"saturday";
        }else {
            nameOfday="Invalid";
        }

        System.out.println(nameOfday);
    }

     //5. Create a method that can print how many days a month has

       public static void daysInMonth(int number){

      //ageGroups



       }





}
