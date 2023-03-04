package day11Switch_Scanner;

public class BrowserName {
    public static void main(String[] args) {

        String browserName= "Edge";
        String result="";
        boolean validBrowserName=browserName=="Chrome"|| browserName==" Firefox"||browserName=="Edge"
                ||browserName=="Safari"||browserName=="Opera";

        switch (browserName){
            case "Chrome":
                result=" Browser is Chrome";
                break;
            case "Firefox":
                result="Browser is Firefox ";
                break;
            case "Edge":
                result="Browser is Edge ";
                break;
            case "Safari":
                result= "Browser is Safari";
            case  "Opera":
                result= "Browser is Opera";

            default:result=" invalid " +browserName;

        }
        System.out.println("result = " + result);



    }




}
