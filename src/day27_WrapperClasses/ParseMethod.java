package day27_WrapperClasses;

public class ParseMethod {
    public static void main(String[] args) {

        String str6="ab1cd2efgh4!";
        int sum=0;
        String letters="";
        String specificChar="";
        for (char each : str6.toCharArray()) {
            if(Character.isDigit(each)){
                sum+=Integer.parseInt(each+"");

            }else if (Character.isLetter(each)){

                letters+=each;
            }else{
                specificChar+=each;
            }
        }
        System.out.println(sum);
        System.out.println(letters);
        System.out.println(specificChar);


    }



}
