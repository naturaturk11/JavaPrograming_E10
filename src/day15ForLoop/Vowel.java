package day15ForLoop;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        /*Use a `loop` to print each vowel( a, e, i, o, u) from the given `word`

Main topics: loops, primitive datatypes, operators, Scanner, String, if statements

```
Ex:
  Input:
    howdyho

  Output:
    oo
```
```
Ex:
  Input:
    java

  Output:
    aa
```
```
Ex:
  Input:
    apple

  Output:
    ae  */
       Scanner input = new Scanner(System.in);
        System.out.println("enter a word");
        String word = input.nextLine();
        char b='a';

        word=word.toLowerCase();

        char ch=' ';

        for (int i=0; i<word.length();i++){
            ch=word.charAt(i);
            if ((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))

                System.out.print(ch+"");

        }
    }















    }

