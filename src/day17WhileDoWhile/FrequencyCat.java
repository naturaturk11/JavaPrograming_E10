package day17WhileDoWhile;

public class FrequencyCat {
    public static void main(String[] args) {

        String str="cat dog cat dog Cat cAt";
        int frequency=0;

        for (int i = 0; i <=str.length()-3 ; i++) {
            String eachSub=    str.substring(i,i+3).toLowerCase();

            if(eachSub.equalsIgnoreCase("CAT")){/* should be added equelsıgnoreCASE İNSTEAD
                                                    EQUEL TO AVOİD THE CASE PROBLEM...LOOK TO 6 LİNE
                                                             */
                frequency+=1;//care about the turn of marks"+="

            }

        }
        System.out.println("frequency = " + frequency);

        System.out.println("...........................................................");

        String s="tere tere tere arab arab hata hata";
        int frequency1=0;


        for (int i = 0; i <=s.length()-4 ; i++) {
            String ferq=s.substring(i,i+4).toLowerCase();

            if(ferq.equals("tere")){
                frequency1++;

            }

        } System.out.println(frequency1);



    }
}
