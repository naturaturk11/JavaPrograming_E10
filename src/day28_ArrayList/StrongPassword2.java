package day28_ArrayList;

public class StrongPassword2 {


    public static void main(String[] args) {
        String password = "cLeod1990@";
        int countUppercase=0;
        int countLowercase=0;
        int countDigits=0;
        int countSpecialCharacters=0;

        for (int i = 0; i <password.length() ; i++) {
            char each=password.charAt(i);



            if(Character.isUpperCase(each)){
                countUppercase++;
            } else if (Character.isLowerCase(each)) {
                countLowercase++;


            } else if (Character.isDigit(each)) {
                countDigits++;
            }else {
                countSpecialCharacters++;
            }
        }
        System.out.println("countSpecialCharacters = " + countSpecialCharacters);
        System.out.println("countDigits = " + countDigits);
        System.out.println("countLowercase = " + countLowercase);
        System.out.println("countUppercase = " + countUppercase);


        boolean hasUpperCASE=countUppercase>0;
        boolean hasLowerCase=countUppercase>0;
        boolean hasDigit=countDigits>0;
        boolean hasSpecialChar=countSpecialCharacters>0;

        boolean strongPassword=password.length()>=8 && !password.contains(" ")
                && hasLowerCase && hasDigit &&hasSpecialChar && hasUpperCASE;

        System.out.println("strongPassword = " + strongPassword);

    }
}
