package day11Switch_Scanner;

public class CydeoBatches {
    public static void main(String[] args) {

        /*String CydeoBatch= "EU";

        String result= "";

        if(CydeoBatch=="EU"){result= "Class times are 10-5 EST. M, T, Th, F.";}
        else if (CydeoBatch=="US morning") { result= "Class times are 7- 10 EST. M, T, W, Th, S, S";}
        else if (CydeoBatch=="US evening") {result= "Class times are  10-5 EST. M, T, W, Th, F.";
        } else { result= " Invalid Batch";}

        System.out.println(result);



    }


    }*/

        String CydeoBatch = "US morning";

        String result = "";
        switch (CydeoBatch) {
            case "EU":
                result = "Class times are 10-5 EST. M, T, Th, F.";
                break;
            case "US morning":
                result = "Class times are 7- 10 EST. M, T, W, Th, S, S";
                break;
            case "US evening":
                result = "Class times are  10-5 EST. M, T, W, Th, F.";
                break;
            default:
                result = "Invalid Batch";
        }
        System.out.println("result = " + result);

    }}
