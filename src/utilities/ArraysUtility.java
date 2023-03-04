package utilities;

import java.util.Arrays;

public class ArraysUtility {

    // 1 print each integer array in separate lines
    public static void printEach(int[]array){
        for (int each : array) {
            System.out.println(each);
        }
    }

    // 2 print each double array in separate lines
    public static void printEach(double[]array){
        for (double each : array) {
            System.out.println(each);
        }
    }

    // 3 print each char array in separate lines
    public static void printEach(char[]array){
        for (char each : array) {
            System.out.println(each);
        }
    }

    // 4 print each STRİNG array in separate lines
    public static void printEach(String[]array){
        for (String each : array) {
            System.out.println(each);
        }
    }



    // 5 returns the maximum number for integer array
    public static int maxNum(int[]num){
        Arrays.sort(num);
      return num[num.length-1];
}

    // 6 returns the maximum number for double array
    public static double maxNum(double[]num) {
        Arrays.sort(num);
        return num[num.length - 1];


    }

    // 7 returns the maximum number for int array

    public static int minNum(int[]num) {
        Arrays.sort(num);
        return num[0];


    }

    // 8 returns the maximum number for double array

    public static double minNum(double[]num) {
        Arrays.sort(num);
        return num[0];


    }

    // 9 checks if the given integer is contained in the given array,returns boolean.contains[int[],int

    public static boolean contains(int[]array,int element){
        boolean result=false;
        for (int each : array) {
            if(each==element){//if any element is matching with the given element,it means the given element is contained
                result=true;
            }
        }
        return result;
    }

    // 10 checks if the given double is contained in the given array,returns boolean.contains[double[],double

    public static boolean contains(double[]array,double element){
        boolean result=false;
        for (double each : array) {
            if(each==element){
                result=true;
            }
        }
        return result;
    }

    //11 checks if the given CHAR is contained in the given array,returns boolean.contains[double[],double

    public static boolean contains(char[]array,char element){
        boolean result=false;
        for (char each : array) {
            if(each==element){
                result=true;
            }
        }
        return result;
    }

    // 12 checks if the given STRİNG is contained in the given array,returns boolean.contains[double[],double

    public static boolean contains(String[]array,String element){
        boolean result=false;
        for (String each : array) {
            if(each.equals(element)){
                result=true;
            }
        }
        return result;
    }

/*13 adds the given element to array,returns anew array

    {1,2,3,4}, 5
            new array ==> {1,2,3,4,5}*/

    public static int[] addElement(int[] array, int element) {

        int[] result = new int[array.length + 1];

        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }
        result[result.length -1] = element;
        //result[i] = element;//this is the same formula equals to  result[i]=element;
        //        //result[i]=element;//element need to be assigned to the last index dk43

        return result;


    }

//   14 adds the given element to array,returns anew array

    public static double[] addElement(double[] array, double element) {

        double[] result = new double[array.length + 1];
        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }
        result[result.length - 1] = element;//this is the same formula equals to  result[i]=element;
        //result[i]=element;//element need to be assigned to the last index dk43
        return result;


    }


    // 15 adds the given element to array,returns anew array

    public static String[] addElement(String[] array, String element) {

        String[] result = new String[array.length + 1];
        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }
        result[result.length - 1] = element;//this is the same formula equals to  result[i]=element;
        //result[i]=element;//element need to be assigned to the last index dk43
        return result;


    }

    //  16 adds the given element to array,returns anew array

    public static char[] addElement(char[] array, char element) {

        char[] result = new char[array.length + 1];
        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }
        result[result.length - 1] = element;//this is the same formula equals to  result[i]=element;
        //result[i]=element;//element need to be assigned to the last index dk43
        return result;


    }

    // 17 returns the frequency of the given int element fromthe given array
    public static int frequencyOfElement(int[]array,int element){
        int count=0;

        for (int each : array) {
            if (each==element){
                count++;
            }
        }
        return count;
    }

    // 18 returns the frequency of the given double element from the given array
    public static int frequencyOfElement(double[]array,double element){
        int count=0;

        for (double each : array) {
            if (each==element){
                count++;
            }
        }
        return count;
    }

    // 19 returns the frequency of the given char element fromthe given array
    public static int frequencyOfElement(char[]array,char element){
        int count=0;

        for (char each : array) {
            if (each==element){
                count++;
            }
        }
        return count;
    }

    // 20 returns the frequency of the given String element fromthe given array
    public static int frequencyOfElement(String[]array,String element){
        int count=0;

        for (String each : array) {
            if (each.equals(element)){//should be used equals instead of ==
                count++;
            }
        }
        return count;
    }

    // 21 unique characters could be obtained by using frequency of chrtacter if ch==1 then it is unique
    public static int[] uniqueElements(int[]array){
        int[]result={};//temp array-new int[0]
        for (int each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){//İF THE FREQUENCY İS 1 THE ELEMENT İS UNİQUE
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    // 22 unique characters could be obtained by using frequency of chrtacter if ch==1 then it is unique
    public static double[] uniqueElements(double[]array){
        double[]result={};//temp array-new double[0]
        for (double each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){//İF THE FREQUENCY İS 1 THE ELEMENT İS UNİQUE
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    // 23 unique characters could be obtained by using frequency of chrtacter if ch==1 then it is unique
    public static char[] uniqueElements(char[]array){
        char[]result={};//temp array-new double[0]
        for (char each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){//İF THE FREQUENCY İS 1 THE ELEMENT İS UNİQUE
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    // 24 unique characters could be obtained by using frequency of chrtacter if ch==1 then it is unique
    public static String[] uniqueElements(String[]array){
        String[]result={};//temp array-new double[0]
        for (String each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){//İF THE FREQUENCY İS 1 THE ELEMENT İS UNİQUE
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    // 25 removes the index from the Array and returns to a new array
    public static int[] removeElement(int[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index");
            System.exit(0);
        }
        int[] result = new int[array.length - 1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {//i is arrays index number

            if (i == index) {//if the index of array  matches
                continue;//skip
            }
            result[j++] = array[i];

        }
        return result;

    }

    // 26 removes the index from the Array and returns to a new array
    public static double[] removeElement(double[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index");
            System.exit(0);
        }
        double[] result = new double[array.length - 1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {//i is arrays index number

            if (i == index) {//if the index of array  matches
                continue;//skip
            }
            result[j++] = array[i];

        }
        return result;

    }

    // 27 removes the index from the Array and returns to a new array
    public static char[] removeElement(char[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index");
            System.exit(0);
        }
        char[] result = new char[array.length - 1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {//i is arrays index number

            if (i == index) {//if the index of array  matches
                continue;//skip
            }
            result[j++] = array[i];

        }
        return result;

    }

    // 28 removes the index from the Array and returns to a new array
    public static String[] removeElement(String[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index");
            System.exit(0);
        }
        String[] result = new String[array.length - 1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {//i is arrays index number

            if (i == index) {//if the index of array  matches
                continue;//skip
            }
            result[j++] = array[i];

        }
        return result;

    }

   // 29 merge the give two arrays and return the new array
    public  static int[]merge(int[] arr1,int[]arr2){
        int[] result={};//new int[arr1.length+arr2.length];
        for (int each : arr1) {
            result=addElement(result,each);

        }

        for (int each : arr2) {
            result=addElement(result,each);
        }

         return result;
    }

    // 30 merge the given two arrays and returns the new arrays
    public static double[] merge(double[]arr1,double[]arr2){
        double[] result={};

        for (double each : arr1) {
            result=ArraysUtility.addElement(result,each);
        }
        for (double each : arr2) {
            result= ArraysUtility.addElement(result,each);
        }
        return result;
    }

    // 31 merge the given two arrays and returns the new arrays
    public static char[] merge(char[]arr1,char[]arr2){
        char[] result={};

        for (char each : arr1) {
            result=ArraysUtility.addElement(result,each);
        }
        for (char each : arr2) {
            result= ArraysUtility.addElement(result,each);
        }
        return result;
    }

    // 32 merge the given two arrays and returns the new arrays
    public static String[] merge(String[]arr1,String[]arr2){
        String[] result={};

        for (String each : arr1) {
            result=ArraysUtility.addElement(result,each);
        }
        for (String each : arr2) {
            result= ArraysUtility.addElement(result,each);
        }
        return result;
    }

    // 33 reverse the Array,returns the new Array
    public static int[] reverse(int[]array){
        int[]result=new int[array.length];
        //int j= 0;this is another option of adding j=0 and j++
        for (int i = array.length - 1,j=0; i >= 0; i--,j++) {
            //result[j++]=array[i];//when added temp int j=0 then increase the size of j only
            result[j]=array[i];
        }
        return result;
    }

    // 34 reverse the Aaray,returns the new Array
    public static String[] reverse(String[]array){
        String[]result=new String[array.length];
        //String j= 0;this is another option of addding j=0 and j++
        for (int i = array.length - 1,j=0; i >= 0; i--,j++) {
            //result[j++]=array[i];//when added temp String j=0 then increase the size of j only
            result[j]=array[i];
        }
        return result;
    }

    // 35 reverse the Array,returns the new Array
    public static double[] reverse(double[]array){
        double[]result=new double[array.length];
        //double j= 0;this is another option of addding j=0 and j++
        for (int i = array.length - 1,j=0; i >= 0; i--,j++) {
            //result[j++]=array[i];//when added temp double j=0 then increase the size of j only
            result[j]=array[i];
        }
        return result;
    }

    // 36 reverse the Array,returns the new Array
    public static char[] reverse(char[]array){
        char[]result=new char[array.length];
        //char j= 0;this is another option of addding j=0 and j++
        for (int i = array.length - 1,j=0; i >= 0; i--,j++) {
            //result[j++]=array[i];//when added temp char j=0 then increase the size of j only
            result[j]=array[i];
        }
        return result;
    }

    // 37 method named replace that passes three parameters: integer array, integer index, integer newElement.
    public static int[] replace(int[]array,int index,int element){
        if(index<0 || index>array.length-1){
            System.err.println("Invalid index");
            System.exit(0);
        }
        array[index]=element;
        return array;




    }

    // 38 method named replace that passes three parameters: double array, integer index, double newElement.
    public static double[] replace(double[]array,int index,double element){
        if(index<0 || index>array.length-1){
            System.err.println("Invalid numbers");
            System.exit(0);
        }
        array[index]=element;
        return array;




    }

    // 39 method named replace that passes three parameters: char array, integer index, integer newElement.
    public static char[] replace(char[]array,int index,char element) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid numbers");
            System.exit(0);
        }
        array[index] = element;
        return array;
    }

    // 40 method named replace that passes three parameters: String array, integer index, integer newElement.
    public static String[] replace(String[]array,int index,String element){
        if(index<0 || index>array.length-1){
            System.err.println("Invalid numbers");
            System.exit(0);
        }
        array[index]=element;
        return array;

    }

    // 41 removes the duplicates from the given array, returns the new array
    public static int[] removeDuplicates(int[] array){

        int[] result = {};//{1,

        for (int each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }

    // 42 removes the duplicates from the given array, returns the new array
    public static double[] removeDuplicates(double[] array){

        double[] result = {};//{1,

        for (double each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }

    // 43 removes the duplicates from the given array, returns the new array
    public static char[] removeDuplicates(char[] array){

        char[] result = {};//{1,

        for (char each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }

    // 44 removes the duplicates from the given array, returns the new array
    public static String[] removeDuplicates(String[] array){

        String[] result = {};//{1,

        for (String each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }

    //  45 replaceAll that passes three parameters: integer array, integer oldElement, integer newElement.
    public static int[] replaceAll(int[]array,int oldElement,int newElement){

        for (int i = 0; i < array.length; i++) {
            if(array[i]==oldElement){//if array index equals to oldElement then array[i] equals to newElement
                array[i]=newElement;//care the used sign not equal but assignment!!!!!!!!
            }

        }
        return array;
    }

    //  46 replaceAll that passes three parameters: double array, double oldElement, double newElement.
    public static double[] replaceAll(double[]array,double oldElement,double newElement){

        for (int i = 0; i < array.length; i++) {
            if(array[i]==oldElement){//if array index equals to oldElement then array[i] equals to newElement
                array[i]=newElement;//care the used sign not equal but assignment!!!!!!!!
            }

        }
        return array;
    }

    //  47 replaceAll that passes three parameters: char array, char oldElement, char newElement.
    public static char[] replaceAll(char[]array,char oldElement,char newElement){

        for (int i = 0; i < array.length; i++) {
            if(array[i]==oldElement){//if array index equals to oldElement then array[i] equals to newElement
                array[i]=newElement;//care the used sign not equal but assignment!!!!!!!!
            }

        }
        return array;
    }

    // 48 replaceAll that passes three parameters: String array, String oldElement, String newElement.
    public static String[] replaceAll(String[]array,String oldElement,String newElement){

        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(oldElement)){//if array index equals to oldElement then array[i] equals to newElement
                array[i]=newElement;//care the used sign not equal but assignment!!!!!!!!
            }

        }
        return array;
    }

    //49 insert that passes three parameters: integer array, integer index, integer element.
    public static int[] insert(int[]array,int index,int element){

        int[]result=new int[array.length+1];
        if(index<0 || index>result.length-1){
            System.out.println("Index is invalid");
            System.exit(0);
        }
        result=ArraysUtility.addElement(array,element);
        result= ArraysUtility.replace(array,index,element);
        return result;
    }

    //50 insert that passes three parameters: DOUBLE array, integer index, DOUBLE element.
    public static double[] insert(double[]array,int index,double element){

        double[]result=new double[array.length+1];
        if(index<0 || index>result.length-1){
            System.out.println("Index is invalid");
            System.exit(0);
        }
        result=ArraysUtility.addElement(array,element);
        result= ArraysUtility.replace(array,index,element);
        return result;
    }

    // 51 insert that passes three parameters: char array, integer index, char element.
    public static char[] insert(char[]array,int index,char element){

        char[]result=new char[array.length+1];
        if(index<0 || index>result.length-1){
            System.out.println("Index is invalid");
            System.exit(0);
        }
        result=ArraysUtility.addElement(array,element);
        result= ArraysUtility.replace(array,index,element);
        return result;
    }

    //52 insert that passes three parameters: String array, integer index, String element.
    public static String[] insert(String[]array,int index,String element){

        String[]result=new String[array.length+1];
        if(index<0 || index>result.length-1){
            System.out.println("Index is invalid");
            System.exit(0);
        }
        result=ArraysUtility.addElement(array,element);
        result= ArraysUtility.replace(array,index,element);
        return result;
    }



}






