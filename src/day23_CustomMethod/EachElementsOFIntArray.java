package day23_CustomMethod;

public class EachElementsOFIntArray {
    public static void main(String[] args) {


        int[]numbers={1,2,3,4,5,6,7,8};
        printEachElement(numbers);





    }
    //create a method named printEachElement that can print each elements of an integer array
    public static void printEachElement(int[]numbers){


        for (int each : numbers) {
            System.out.println(each);
        }

    }





}
