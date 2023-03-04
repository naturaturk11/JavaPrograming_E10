package day11Switch_Scanner;

public class Browsers {
    public static void main(String[] args) {

/*Warmup Tasks:
1. Create a class called Browser. Write a program that can display
the name of selected browser
        1. declear a String variable named browserName
        2. Assume that the valid browsers are: chrome,
firefox, opera, safari, edge
        3. if the browser name does not match with the
valid browsers' names,
        out put should be: Invalid Browser Name
        Ex:
        String browser = "chrome";
    Output:
    Chrome Browser is selected
Note: MUST use nested if*/

        String browserName = "chrome";
        boolean validBrowsers = browserName == "chrome" || browserName == "firefox" ||
                browserName == "edge" || browserName == "opera" || browserName == "safari";
        String result = "";

        if (validBrowsers) {
            if (browserName == "chrome") {
                result = " chrome is the browser";
            } else if (browserName == "firefox") {
                result = " firefox is the browser";
            } else if (browserName == "opera") {
                result = "opera is the browser";
            } else if (browserName == "edge") {
                result = "edge is the browser";
            } else {
                result = "safari is the browser";
            }


        } else {
            result = "browser is ınvalid";
        }
        System.out.println("result = " + result);


    }
}
