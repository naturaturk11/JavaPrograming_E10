package day20_Array;

public class LongestWord {
    public static void main(String[] args) {

        String[] arr = {"aaa", "bbbbb", "whasstupppp", "longg", "jaaaaavvaaaaaaaaaa"};

       // System.out.println(arr[4].length());
          String maxWord="";
        int maxLenght=arr[0].length();
        for (int i = 0; i < arr.length; i++) {

            if(arr[i].length()>maxLenght){
                maxWord=arr[i];






        }
            }
        System.out.println(maxWord);

        }
















    }


