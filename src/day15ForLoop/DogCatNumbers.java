package day15ForLoop;

public class DogCatNumbers {
    public static void main(String[] args) {
        /*write a program to print true if the string "cat" and "dog" appear
        the same number of times in the given sentence

	        Ex:
	            sentence = "caT dog dogG cAt"

	            output:
	                true*/

      String a="cat DOG CaT dOG dOG caT";

      int countCat=0;
      int countDog=0;

        for (int i = 0; i <=a.length()-3 ; i++) {
                                   //imp point

            a=a.toLowerCase();

            String s=a.substring(i,i+3);

            if(s.equals("cat")){
                countCat++;
            } else if (s.equals("dog")) {
                countDog++;
            }

        }boolean result=countCat==countDog;
        System.out.println("result = " + result);








    }
}
