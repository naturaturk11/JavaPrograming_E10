package day15ForLoop;

public class EachWord {
    public static void main(String[] args) {
   /**Use a `loop` to print each letter of the given `word` on a separate line

    Main topics: loops, primitive datatype, operators, Scanner, String

    ```
    Ex:
    Input:
    hello

    Output:
    h
    e
    l
    l
    o
    ```
    ```
    Ex:
    Input:
    Zimbabwe

    Output:
    Z
    i
    m
    b
    a
    b
    w
    e
    ```*/

     String a="Hasan Sadebıyık";

        for (int i = 0; i <=a.length()-1 ; i++) {
            char ch = a.charAt(i);
            System.out.println(ch + " \t");


        }

            String r="Kimsin lan sen";
            for (int l = 0; l <= r.length()-1; l++) {
                char ch1=r.charAt(l);
                System.out.println(ch1+" \t");
            }




        }










    }

