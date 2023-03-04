package day11Switch_Scanner;

public class TryExam5 {
    public static void main(String[] args) {

        int num = 2;
        String result = "";
        if (num >= 0 && num <= 9) {
            result = (num == 0) ? "ZERO" : (num == 1) ? "ONE" : (num == 2) ?
                    "TWO" : (num == 3) ? "Three" : (num == 4) ?
                    "four" : (num == 5) ? "five" : (num == 6) ?
                    "six" : (num == 7) ? " seven" : (num == 8) ?
                    "eight" : "nine";




        } else result = "invalid numbers";
        System.out.println("result = " + result);

    }}
