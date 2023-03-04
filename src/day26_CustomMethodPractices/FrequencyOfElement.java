package day26_CustomMethodPractices;

public class FrequencyOfElement {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,2,1,3,2,1,2,3,5,1};
       int ferq1=frequencyOfElement(arr,1);

        System.out.println("ferq1 = " + ferq1);










    }
    //returns the frequency of the given int element fromthe given array
    public static int frequencyOfElement(int[]array,int element){
    int count=0;

    for (int each : array) {
        if (each==element){
            count++;
        }
    }
    return count;
}

    //returns the frequency of the given double element from the given array
    public static int frequencyOfElement(double[]array,double element){
        int count=0;

        for (double each : array) {
            if (each==element){
                count++;
            }
        }
        return count;
    }


    //returns the frequency of the given char element fromthe given array
    public static int frequencyOfElement(char[]array,char element){
        int count=0;

        for (char each : array) {
            if (each==element){
                count++;
            }
        }
        return count;
    }

    //returns the frequency of the given String element fromthe given array
    public static int frequencyOfElement(String[]array,String element){
        int count=0;

        for (String each : array) {
            if (each==element){
                count++;
            }
        }
        return count;
    }






}
// Create a class named FrequencyOfElement:
// 1.1 Create a method that passes two parameters: an integer array and an Integer element. The method returns the frequency of the given integer element from the integer array

//1.2 Create a method that passes two parameters: a double array and a double element. The method returns the frequency of the given integer from the array

//1.3 Create a method that passes two parameters: a char array and a char element. The method returns the frequency of the given char element from the char array

//1.4 Create a method that passes two parameters: a String array and a String element. The method returns the frequency of the given String element from the String array
